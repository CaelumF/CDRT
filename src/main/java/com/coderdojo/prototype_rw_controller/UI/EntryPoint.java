package com.coderdojo.prototype_rw_controller.UI;

import com.coderdojo.prototype_rw_controller.KClassesToClassesKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import tornadofx.App;
import tornadofx.View;

/**
 * First created 4/8/2016 in CoderdojoRobotController
 */
public class EntryPoint extends App{
  public EntryPoint(){

  }

  @NotNull @Override public KClass<? extends View> getPrimaryView(){
    return KClassesToClassesKt.getRWController();
  }
}
