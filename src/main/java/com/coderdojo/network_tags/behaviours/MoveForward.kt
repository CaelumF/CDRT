package com.coderdojo.network_tags.behaviours

/**
 * First created 4/28/2016 in CoderdojoRobotController
 * Stub class
 */
public class MoveForward(val LWspeed: Float = 1.0f, val RWSpeed: Float, val durationMillis: Int = 10) : Behaviour(){
    override val behaviourIdentifier: String = "MoveForward"

    override fun onReceive() {
        //Stub
    }

    companion object{
        @JvmStatic val serialVersionUID: Long = 590473204662185747
    }
}