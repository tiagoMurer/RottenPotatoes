import DataBase.Database;
import Entidades.*;
import Repositorios.*;

public class App {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        db.connectDb();
        UsuarioRep repUser = new UsuarioRep();
        FilmeRep repFilme = new FilmeRep();
        
        
        System.out.println("Login: ");
        System.out.println(repUser.validarLogin("user1@gmail.com", "user1pass"));
        System.out.println("FOI");
        
        Usuario user = new Usuario("emailteste@gmail.com", "SenhaTeste", 0);
        repUser.remove(user);
        System.out.println(repUser.getUserById(1));
        System.out.println(repUser.loadUserRep());
        System.out.println(repFilme.loadFilmeRep());
        

        
        db.disconnctDb();
    }
}
