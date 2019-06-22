package Sessao;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Entidades.Usuario;
import Rotten.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import com.jfoenix.controls.JFXButton;

public class UserScreenController implements Initializable {
    @FXML
    private AnchorPane profilePane;

    @FXML
    private Text userName = null;

    @FXML
    private JFXButton btProfile;

    @FXML
    private JFXButton btAmigos;

    @FXML
    private JFXButton btFavoritos;

    @FXML
    private JFXButton btBuscar;

    @FXML
    private JFXButton btSair;

    @FXML
    private AnchorPane contentPane;
	
	private static Usuario user = null;
	
	public void buildUserScreen(Usuario user1) throws IOException {
		user = user1;
		Parent root = FXMLLoader.load(getClass().getResource("/Sessao/UserScreen.fxml"));
		Scene scene = new Scene(root);
		App.changeScene(scene);
	}
	
	public void irParaPerfil() {
		
	}

	public void sair() throws IOException {
		this.user = null;
		Parent root = FXMLLoader.load(getClass().getResource("/Sessao/Login.fxml"));
		App.changeScene(new Scene(root));
	}

	public void initialize(Usuario user) {
		
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		userName.setText(user.getPerfil().getName());
		
	}
	
}
