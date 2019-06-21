import DataBase.Database;
import Entidades.*;
import Repositorios.*;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        Database db = Database.runDb();
        
        System.out.println(db.filmeRep.loadFilmeRep());
        System.out.println(db.usuarioRep.loadUserRep());
        // ADICIONAR REPOSITÓRIO DE PERFIL, E COLOCAR PRA QUANDO DELETER USUARIO DELETAR PERFIL

        
        db.disconnctDb();
    }

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		
	}
}
