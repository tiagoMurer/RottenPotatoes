package Repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import DataBase.Database;
import Entidades.Usuario;

public class UsuarioRep implements Repository<Object>{
	Connection connection = Database.connection;
	
	@Override
	public void add(Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object item) {
		// TODO Auto-generated method stub
		
	}
	
	public HashMap<Integer, Usuario> loadUserRep() {
		
		HashMap<Integer, Usuario> usuarios = new HashMap<>();
		Usuario usuario = null;
		
		try{
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM usuario");
			ResultSet consulta = stmt.executeQuery();
			
			while(consulta.next()) {
				int id = consulta.getInt("id_user");
				String email = consulta.getString("email");
				String senha = consulta.getString("senha");
				int idPefil = consulta.getInt("id_perfil");
				
				usuario = new Usuario(id, email, senha, idPefil);
				usuarios.put(id, usuario);
			}
			consulta.close();
			return usuarios;
			
		}	catch(SQLException e) {
			System.out.println("Exceção em LoudUserrep " +e);
			return null;
		}
	}
	
	public Usuario getUserById(int id) {
		
		Usuario usuario = null;
		
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM usuario WHERE id_user=" + id);
			ResultSet consulta = stmt.executeQuery();
			
			String email = consulta.getString("email");
			String senha = consulta.getString("senha");
			int idPefil = consulta.getInt("id_perfil");
			
			usuario = new Usuario(id, email, senha, idPefil);
			return usuario;	
			
		}	catch(SQLException e) {
			System.out.println("Exceção em getUserById " +e);
			return null;
		}	
	}
    
}
