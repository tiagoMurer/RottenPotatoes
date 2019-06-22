package Sessao;

import java.io.IOException;

import Entidades.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


public class UserScreenController {
    @FXML
    private AnchorPane profilePane;

    @FXML
    private Text userName;

    @FXML
    private Button btProfile;

    @FXML
    private Button btAmigos;

    @FXML
    private Button btFavoritos;

    @FXML
    private Button btBuscar;

    @FXML
    private Button btSair;

    @FXML
    private AnchorPane contentPane;
	
	private Usuario user = null;
	
	public Scene buildUserScreen(Usuario user) throws IOException {
		this.user = user;
		Parent root = FXMLLoader.load(getClass().getResource("/Session/UserScreen.fxml"));
		
		
		
		return null;
		
	}
	
	public void irParaPerfil() {
		
	}

	public void sair() {
		
	}
	
}
