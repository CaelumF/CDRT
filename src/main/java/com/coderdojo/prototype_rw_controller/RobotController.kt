package com.coderdojo.prototype_rw_controller

/**
 * First created 4/15/2016 in CoderdojoRobotController
 */
abstract class RobotController {
  var curSpeed = 1f;

  open fun moveForward(speed: Float = curSpeed, duration: Float = 1.0f) {

    if(speed != curSpeed){

    }

  }

  abstract fun moveLWForward()

}
