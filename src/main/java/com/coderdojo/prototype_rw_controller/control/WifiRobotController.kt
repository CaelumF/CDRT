package com.coderdojo.prototype_rw_controller.control

import com.coderdojo.network_tags.behaviours.MoveForward
import com.gmail.caelum119.utils.network.TCPConnectionToServer
import com.gmail.caelum119.utils.network.tags.MessageTag
import com.gmail.caelum119.utils.network.tags.TagHandshake
import java.net.InetAddress
import java.net.Socket

/**
 * First created 4/15/2016 in CoderdojoRobotController
 */
public class WifiRobotController(address: InetAddress, port: Int) : RobotController() {
    //TODO: Find better singleton-with-constructor-arguments design
    val connectionToChip: TCPConnectionToServer

    companion object {
        var instance: WifiRobotController? = null
        var connected = false

        fun connect(address: InetAddress, port: Int): Unit {
            instance = WifiRobotController(address, port)
            connected = true
        }
    }

    init {
        instance = this
        connectionToChip = TCPConnectionToServer(Socket(address, port), address, port)
        Thread(connectionToChip).start()
        connectionToChip.addListener(TagHandshake::class.java, { println("Successfully connected to $address:$port") })
        connectionToChip.addListener(MessageTag::class.java, fun(received: MessageTag) {
            println("Message received ${received.message}")
        })
    }

    override fun moveForward(speed: Float, duration: Float) {
        super.moveForward(speed, duration)
        connectionToChip.sendTag(MoveForward(speed, duration))
    }

    override fun moveLWForward(speed: Float, duration: Float) {
        super.moveLWForward(speed, duration)
    }

    override fun moveRWForward(speed: Float, duration: Float) {
        super.moveRWForward(speed, duration)
    }
}