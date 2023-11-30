 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package prak15_dinisoraya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */

public class FormInputController {

    @FXML
    private TextField lblNpm;

    @FXML
    private Button btnTambah;

    @FXML
    private TextField lblAlamat;

    @FXML
    private TextField lblNama;

    @FXML
    void sendData(ActionEvent event)  throws IOException {
        Mahasiswa mhs = new Mahasiswa(lblNpm.getText(), lblNama.getText(), lblAlamat.getText());
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Keluaran.fxml"));
        Parent root = loader.load();
        
        KeluaranController keluaranController = loader.getController();
        keluaranController.showValue(mhs);
        
        Stage stage = (Stage) btnTambah.getScene().getWindow();
        stage.setScene(new Scene(root));  
    }

}
