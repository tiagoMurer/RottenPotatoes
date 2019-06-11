import DataBase.Database;

public class App {
    public static void main(String[] args) throws Exception {
        Database db = new Database();

        db.connectDb();
        db.disconnctDb();
    }
}
