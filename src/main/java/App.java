import DataBase.Database;
import Entidades.*;
import Repositorios.*;

public class App {
    public static void main(String[] args) throws Exception {
        Database db = Database.runDb();
        
        System.out.println(db.filmeRep.loadFilmeRep());
        System.out.println(db.usuarioRep.loadUserRep());
        // ADICIONAR REPOSITÓRIO DE PERFIL, E COLOCAR PRA QUANDO DELETER USUARIO DELETAR PERFIL

        
        db.disconnctDb();
    }
}
