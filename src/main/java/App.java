import DataBase.Database;
import Entidades.*;
import Repositorios.*;

public class App {
    public static void main(String[] args) throws Exception {
        Database db = new Database();
        db.connectDb();
        FilmeRep rep = new FilmeRep();
      
        
        Filme filme = rep.getFilmesById(1);
        System.out.println(filme);
        
        System.out.println(rep.loadFilmeRep());
        
        db.disconnctDb();
    }
}
