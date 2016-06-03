package com.coderdojo.network_tags.behaviours



/**
 * First created 6/3/2016 in CoderdojoRobot
 * Stub class
 */
class Turn(val speed: Float, val direction: Float, val duration: Int): Behaviour(){
    override val behaviourIdentifier: String = "Turn"

    companion object {
        @JvmStatic val serialVersionUID: Long = 590473212662185747
    }
    init{
        println("Turn constructed")
    }
    override fun onReceive() {
        //Stub
    }
}