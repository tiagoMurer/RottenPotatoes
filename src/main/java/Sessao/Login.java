package Sessao;

import java.net.URL;
import java.util.ResourceBundle;

import DataBase.Database;
import Entidades.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Rotten.App;
public class Login {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField inputid;

    @FXML
    private PasswordField inputpswd;

    @FXML
    private Button loginbtn;
    
    @FXML
    void initialize() {
        assert inputid != null : "fx:id=\"inputemail\" was not injected: check your FXML file 'Untitled'.";
        assert inputpswd != null : "fx:id=\"inputpswd\" was not injected: check your FXML file 'Untitled'.";
        assert loginbtn != null : "fx:id=\"loginbtn\" was not injected: check your FXML file 'Untitled'.";
    	}  
    
    public void validateLogin() throws Exception {
    	String id = inputid.getText();
    	String pass = inputpswd.getText();
    	//App.db.usuarioRep.validarLogin();
    	Usuario user =  App.db.usuarioRep.validarLogin(id, pass);
    	if(user != null) {
    		UserScreenController uc = new UserScreenController();
    		uc.buildUserScreen(user);
    	}
    }
}