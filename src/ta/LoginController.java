/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXPasswordField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ardelya
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXTextField inuser;

    @FXML
    private JFXPasswordField pw;
        private Label tampilPass;
    private Label tampilUser;
    String user, pass;
    
    @FXML
    private Button logins;
    public String usern="admin";
    public String passw="seratussatu";
    
    @FXML
    private void login(ActionEvent event) {
     
        user=inuser.getText();
        pass=pw.getText();
        
        if(user.equalsIgnoreCase(usern) && pass.equalsIgnoreCase(passw)){
        try {
        
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("gajian.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("PENGGAJIAN");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
        
        
//        if(username.equalsIgnoreCase("tomboluwe") && password.equalsIgnoreCase("mangan")){
//          Parent Home = FXMLLoader.load(getClass().getResource("FXMLHome.fxml"));
//          Scene homescene = new Scene(Home);
//          Stage on = (Stage)((Node)event.getSource()).getScene().getWindow();
//          on.setScene(homescene);
//            on.show();
//        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
