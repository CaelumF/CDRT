package com.coderdojo.prototype_rw_controller.UI


import com.coderdojo.Popup
import com.coderdojo.prototype_rw_controller.WifiRobotController
import com.gmail.caelum119.utils.FXUtils.TextFieldToNumberField
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import tornadofx.View
import java.net.InetAddress

/**
 * First created 4/14/2016 in CoderdojoRobotController
 */
class ConnectionPopup(): View() {
  override val root: GridPane by fxml("/main/fxml_resources/connection/ConnectionDialog.fxml")

  @FXML lateinit var address: TextField
  @FXML lateinit var port: TextField
  val intPort = TextFieldToNumberField(port)
  @FXML lateinit var okButton: Button
  @FXML lateinit var cancelButton: Button

  init {
    Popup(primaryStage, root).show()

    okButton.onAction = EventHandler {
      WifiRobotController(InetAddress.getByName(address.text), intPort.getNumber())
    }
  }

}
