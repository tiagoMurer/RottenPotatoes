package DataBase;

import java.sql.*;

import Repositorios.*;

public class Database {

	public static Connection connection = null;
	
	public FilmeRep filmeRep = null;
	public UsuarioRep usuarioRep = null;
	public PerfilRep perfilRep = null;
	
	public void connectDb() throws Exception{

		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:rottentomatoes.db");
			System.out.println("Conexão Estabelecida");
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public void disconnctDb() throws Exception{
		if(connection != null){
			try {
				connection.close();
				System.out.println("DataBase Desconectado!");
				
			}	catch(SQLException exc) {
				System.out.println(exc);
			}
		}
	}
	
	public static Database runDb() throws Exception {
		Database db = new Database();
		db.connectDb();
		db.filmeRep = new FilmeRep();
		db.usuarioRep = new UsuarioRep();
		db.perfilRep = new PerfilRep();
		return db;
	}
	
}
