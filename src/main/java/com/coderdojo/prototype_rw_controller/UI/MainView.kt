package com.coderdojo.prototype_rw_controller.UI

import com.coderdojo.Popup
import com.coderdojo.network_tags.behaviours.MoveForward
import com.coderdojo.network_tags.behaviours.Turn
import com.coderdojo.prototype_rw_controller.BehaviourService
import javafx.fxml.FXML
import javafx.scene.Parent
import javafx.scene.control.TabPane
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import javafx.scene.layout.VBox
import tornadofx.View


/**
 * First created 4/8/2016 in CoderdojoRobotController
 */
class MainView() : View() {
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
            when(it.code) {
                KeyCode.E -> Popup(primaryStage, ConnectionPopup().root)
                KeyCode.W -> BehaviourService.runBehaviourOnRobot(MoveForward(1f, 1f, 10))
                KeyCode.D -> BehaviourService.runBehaviourOnRobot(Turn(1f, 1f, 10))
                KeyCode.A -> BehaviourService.runBehaviourOnRobot(Turn(1f, -1f, 10))
            }
        })
    }

    fun setCenterContent(content: Parent) {

    }
}