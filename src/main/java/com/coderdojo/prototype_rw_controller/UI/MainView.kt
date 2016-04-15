package com.coderdojo.prototype_rw_controller.UI

import javafx.scene.input.KeyEvent
import javafx.scene.layout.VBox
import tornadofx.View

/**
 * First created 4/8/2016 in CoderdojoRobotController
 */
class MainView(): View() {
  override val root: VBox by fxml("resources/MainView.w")
  init {

    primaryStage.addEventFilter(KeyEvent.KEY_PRESSED, {
      ConnectionTab()
    })
  }
}