package Sessao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField inputid;

    @FXML
    private TextField inputpswd;

    @FXML
    private Button loginbtn;
    
    @FXML
    void initialize() {
        assert inputid != null : "fx:id=\"inputemail\" was not injected: check your FXML file 'Untitled'.";
        assert inputpswd != null : "fx:id=\"inputpswd\" was not injected: check your FXML file 'Untitled'.";
        assert loginbtn != null : "fx:id=\"loginbtn\" was not injected: check your FXML file 'Untitled'.";

    }