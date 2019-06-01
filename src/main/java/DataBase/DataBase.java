package DataBase;

import java.sql.*;

public class DataBase {

	Connection connection = null;

	public void connectDb() throws Exception{

		try{
			Class.forName("org.sqqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("Conexão Estabelecida");
		} catch(Exception e){
			System.out.println(e);
		}


	}
}
