package Sessao;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Entidades.Perfil;
import Entidades.Usuario;
import Rotten.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

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
    @FXML
    private Text welcome;
   
    // INICIO PANE DE PERFIL
    @FXML
    private AnchorPane perfilPane;
    @FXML
    private Text perfilUserName;
    @FXML
    private JFXTextField inNome;
    @FXML
    private JFXButton btNome;
    @FXML
    private Text perfilSobrenome;
    @FXML
    private JFXTextField inSobrenome;
    @FXML
    private JFXButton btSobrenome;
    @FXML
    private Text warning;
    @FXML
    private Text perfilEmail;
    @FXML
    private JFXTextField inEmail;
    @FXML
    private JFXButton btEmail;
    @FXML
    private JFXPasswordField inOldPass;
    @FXML
    private JFXPasswordField inNewPass;
    @FXML
    private JFXButton btMudarSenha;
    @FXML
    private JFXButton btExcluir;
    // FIM PANE DE PERFIL

	private AnchorPane ativo; 
    
	private static Usuario user = null;
	
	public void buildUserScreen(Usuario user1) throws IOException {
		user = user1;
		Parent root = FXMLLoader.load(getClass().getResource("/Sessao/UserScreen.fxml"));
		Scene scene = new Scene(root);
		App.changeScene(scene);
	}
	
	public void mudarAba(ActionEvent event){
		JFXButton botaoClicado = (JFXButton)event.getSource();
		switch(botaoClicado.getId()){
		case "btProfile" :
			atualizarPerfilPane();
		break;
		
		case "btAmigos" :
			ativo.setVisible(false);
		break;
		
		case "btFavoritos" :
			ativo.setVisible(false);
		break;
		
		case "btBuscar" :
			ativo.setVisible(false);
		break;
		}
	}
	
	
	public void sair() throws IOException {
		user = null;
		Parent root = FXMLLoader.load(getClass().getResource("/Sessao/Login.fxml"));
		App.changeScene(new Scene(root));
	}

	public void atualizarDados() {
		
	}
	
	public void initialize(Usuario user) {
		
		
	}
	
	public void updatePerfil() {
		
	}
	
	public void updateUser(ActionEvent event){
		JFXButton b = (JFXButton)event.getSource();
		switch(b.getId()) {
		case "btEmail":
			if(!inEmail.getText().isEmpty() && !inEmail.getText().isBlank()) {
				App.db.usuarioRep.updateSomethingString(user, inEmail.getText(), "email");
				atualizarPerfilPane();
				warning.setText("Atualizado");
			}
			else {
				warning.setText("Digite algo");
			}
			
		break;
		case "btMudarSenha":
			if(!inOldPass.getText().isBlank() && !inOldPass.getText().isEmpty()
					&& !inNewPass.getText().isEmpty() && !inNewPass.getText().isBlank()) {
				
				if(inOldPass.getText().equals(user.getPswd())){
					App.db.usuarioRep.updateSomethingString(user, inNewPass.getText(), "senha");
					warning.setText("Senha alterada");
				}
				else {
					warning.setText("Senha antiga errada");
				}
			}
			else {
				warning.setText("Preencha todos os campos");
			}
		break;
		}
	}
	
	public void excluirConta(ActionEvent event) throws IOException {
		if(!warning.getText().equals("Tem certeza?")) {
			warning.setText("Tem certeza?");
			btExcluir.setText("Sim!");
		}
		else if(warning.getText().equals("Tem certeza?")){
			warning.setText("Mas tudo que passamos juntos?");
			btExcluir.setText("Pai tá online");
			App.db.usuarioRep.remove(user);
			sair();
		}
	}
	
	public void atualizarPerfilPane() {
		ativo.setVisible(false);
		ativo = perfilPane;
		ativo.setVisible(true);
		perfilUserName.setText(user.getPerfil().getName());
		perfilSobrenome.setText(user.getPerfil().getSobrenome());
		perfilEmail.setText(user.getEmail());
		this.userName.setText(""+user.getPerfil().getName()+" "+user.getPerfil().getSobrenome());
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.userName.setText(""+user.getPerfil().getName()+" "+user.getPerfil().getSobrenome());
		this.ativo = contentPane;
	}
	
}
