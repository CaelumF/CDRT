package com.coderdojo.prototype_rw_controller

import com.coderdojo.network_tags.behaviours.Behaviour
import com.coderdojo.network_tags.behaviours.NetworkedBehaviour
import com.coderdojo.prototype_rw_controller.control.WifiRobotController

/**
 * First created 6/3/2016 in CoderdojoRobotController
 */
object BehaviourService{

    fun runBehaviourOnRobot(behavior: Behaviour){
        try {
            WifiRobotController.instance!!.connectionToChip.sendTag(NetworkedBehaviour(behavior))
        }catch(e: NullPointerException){
            println("Connect to robot before running Behaviour ${behavior.behaviourIdentifier}")
        }
    }
}