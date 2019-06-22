package Entidades;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Perfil {
    private String id;
    private String name;
    private int age; //tirar idade de birthday
    private HashMap<Integer, Perfil> contatos;
    private HashMap<Integer, Filme> filmesFavoritos;

    Perfil(String name, Date birthday){
        this.name = name;
        this.filmesFavoritos = new HashMap<Integer, Filme>();
        this.contatos = new HashMap<Integer, Perfil>();
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
