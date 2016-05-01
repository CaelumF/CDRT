package com.coderdojo

import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Modality
import javafx.stage.Stage
import javafx.stage.StageStyle

/**
 * First created 4/28/2016 in Engine
 */
public class Popup(val owner: Stage){
  val dialog = Stage()

  init {
    dialog.initModality(Modality.NONE)
    dialog.initStyle(StageStyle.UNIFIED)
    dialog.initOwner(owner)
  }

  constructor(owner: Stage, content: Pane): this(owner){
    try {
      dialog.scene = Scene(content)
    }catch(e: IllegalArgumentException){
      //TODO: Fix this properly
    }
  }

  constructor(owner: Stage, content: Pane, modality: Modality): this(owner, content){
    dialog.initModality(modality)
  }

  fun show(){
    dialog.show()
  }
}