package DataBase;

import java.sql.*;

public class Database {

	Connection connection = null;

	public void connectDb() throws Exception{

		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:rottentomatoes.db");
			System.out.println("Conexão Estabelecida");
		} catch(Exception e){
			System.out.println(e);
		}


	}
}
