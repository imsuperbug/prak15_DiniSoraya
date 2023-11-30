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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */

public class KeluaranController {

    @FXML
    private Button btnNew;

    @FXML
    private Label lblNpm;

    @FXML
    private Label lblAlamat;

    @FXML
    private Label lblNama;
    
    public void showValue(Mahasiswa mhs) {
        lblNpm.setText(mhs.getNpm());
        lblNama.setText(mhs.getNama());
        lblAlamat.setText(mhs.getAlamat());
    }

    @FXML
    void openForm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FormInput.fxml"));
        
        Stage stage = (Stage) btnNew.getScene().getWindow();
        stage.setScene(new Scene(root));       
    }

}

