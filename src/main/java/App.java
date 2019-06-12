import DataBase.Database;
import Entidades.*;
import Repositorios.*;

public class App {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        db.connectDb();
        FilmeRep rep = new FilmeRep();
        System.out.println(rep.loadFilmeRep());
        

        
        db.disconnctDb();
    }
}
