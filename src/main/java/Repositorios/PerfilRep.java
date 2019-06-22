package Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import DataBase.Database;
import Entidades.Perfil;
import Entidades.Usuario;

public class PerfilRep {
	Connection connection = Database.connection;
	
	public HashMap<Integer, Perfil> loadPerfilRep() {
		HashMap<Integer, Perfil> perfis = new HashMap<>();
		Perfil perfil = null;
		
		try{
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM perfil");
			ResultSet consulta = stmt.executeQuery();
			
			while(consulta.next()) {
				int id = consulta.getInt("id_prof");
				String nome = consulta.getString("nome");
				String sobrenome = consulta.getString("sobrenome");
				int idUser = consulta.getInt("id_user");
				
				perfil = new Perfil(nome, sobrenome, idUser);
				perfis.put(id, perfil);
			}
			consulta.close();
			return perfis;
			
		}	catch(SQLException e) {
			System.out.println("Exceção em LoudUserrep " +e);
			return null;
		}
	}
	
	public Perfil getPerfilById(int id) {
		HashMap<Integer, Perfil> perfis = new HashMap<>();
		perfis = loadPerfilRep();
		
		return perfis.get(id);
	}
	
}
