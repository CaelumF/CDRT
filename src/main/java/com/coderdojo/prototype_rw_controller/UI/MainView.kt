package com.coderdojo.prototype_rw_controller.UI

import com.coderdojo.Popup
import javafx.fxml.FXML
import javafx.scene.Parent
import javafx.scene.control.TabPane
import javafx.scene.input.KeyEvent
import javafx.scene.layout.VBox
import tornadofx.View


/**
 * First created 4/8/2016 in CoderdojoRobotController
 */
class MainView(): View() {
  override val root: VBox by fxml("/main/fxml_resources/mainview/MainView.fxml")

  @FXML lateinit var controlTabPane: TabPane
  init {
//
//    controlTabPane.selectionModel.selectedIndexProperty().addListener {observableValue, oldItem, newItem ->
//      when(controlTabPane.tabs[newItem.toInt()].text){
//        "Handheld controller" ->
//        "Keyboard" ->
//      }
//    }

    primaryStage.addEventFilter(KeyEvent.KEY_PRESSED, {
      Popup(primaryStage, ConnectionPopup().root)
    })
  }

  fun setCenterContent(content: Parent){

  }
}