package Entidades;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Rotten.App;


public class Perfil {
    private int id_user;
    private String name;
    private String sobrenome;
    private int age; //tirar idade de birthday
    private int id_perfil;
    private HashMap<Integer, Perfil> contatos;
    private HashMap<Integer, Filme> filmesFavoritos;

    public Perfil(String name, String sobrenome, int id_perfil){
        this.name = name;
        this.setSobrenome(sobrenome);
        this.setId_perfil(id_perfil);
        this.filmesFavoritos = new HashMap<Integer, Filme>();
        this.contatos = new HashMap<Integer, Perfil>();
        this.id_user = id_perfil;
    }

    //gestão de contatos e filmes
    public void adicionarContato(Perfil usuario, int idContato){
        contatos.put(idContato ,usuario);
        //database.update (implementar)
    }
    public void removerContato(Perfil contato){
    	for(Entry<Integer, Perfil> entry : this.contatos.entrySet()){
    		if(entry.getValue().equals(contato)){
    			this.contatos.remove(entry.getKey());
    		}
    	}
    }

    public void favoritarFilme(Filme filme){
    	//TODO
    	// filmesFavoritos.add(filme);
        int numFans = filme.getNumeroFans();
        filme.setNumeroFans(numFans + 1);
        //database.update (implementar)
    }
    public void desfavoritarFilme(Filme filme){
        filmesFavoritos.remove(filme);
        int numFans = filme.getNumeroFans();
        filme.setNumeroFans(numFans - 1);
        //database.update (implementar)
    }




    //getters+setters


    public int getIdUser() {
        return id_user;
    }

    public void setIdUser(int id) {
        this.id_user = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
