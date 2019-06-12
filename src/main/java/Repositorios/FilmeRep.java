package Repositorios;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DataBase.Database;

import java.sql.ResultSet;


import Entidades.Filme;

public class FilmeRep implements Repository {
	
	Connection connection = Database.connection;
	
	@Override
	public void add(Object item) {
		
	}

	@Override
	public void remove(Object item) {
		
	}
	
	public ArrayList<Filme> loadFilmeRep() {
		ArrayList<Filme> filmes = new ArrayList<>();
		Filme filme = null;
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM filmes");
			ResultSet consulta = stmt.executeQuery();
			
			while(consulta.next()){
				String nome = consulta.getString("nome_filme");
				int ano = consulta.getInt("ano_filme");
				String genero = consulta.getString("genero");
				String diretor = consulta.getString("diretor");
				int numeroFans = consulta.getInt("numero_favoritos");
				
				filme = new Filme(nome, ano, genero, diretor);
				filme.setNumeroFans(numeroFans);
				filmes.add(filme);
			}
			return filmes;
			
		}	catch(SQLException e) {
			System.out.println(e);
			return null;
		}
	}

	public Filme getFilmesById(int id) {
		Filme filme = null;
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM filmes WHERE id_filme = " + id);
			ResultSet consulta = stmt.executeQuery();
			
			String nome = consulta.getString("nome_filme");
			int ano = consulta.getInt("ano_filme");
			String genero = consulta.getString("genero");
			String diretor = consulta.getString("diretor");
			int numeroFans = consulta.getInt("numero_favoritos");
			
			filme = new Filme(nome, ano, genero, diretor);
			filme.setNumeroFans(numeroFans);
			
			return filme;
		} catch(SQLException e) {
			System.out.println(e);
			
			return null;
		}
		
	}
}