/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Ardelya
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField username;
    @FXML
    private JFXTextField harikerja;
    @FXML
    private JFXTextField jabatan;
    @FXML
    private JFXTextField lembur;
    @FXML
    private JFXTextField anak;
    @FXML
    private Button submit;
    @FXML
    private Button hapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void input(ActionEvent event) {
    }
    
}
