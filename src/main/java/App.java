import DataBase.Database;
import Entidades.*;
import Repositorios.*;

public class App {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        db.connectDb();
        UsuarioRep repUser = new UsuarioRep();
        FilmeRep repFilme = new FilmeRep();
        
        System.out.println(repUser.getUserById(1));
        System.out.println(repUser.loadUserRep());
        System.out.println(repFilme.loadFilmeRep());
        

        
        db.disconnctDb();
    }
}
