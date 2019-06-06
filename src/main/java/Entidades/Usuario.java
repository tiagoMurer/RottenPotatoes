package Entidades;

import java.util.Date;
import java.util.HashSet;


public class Usuario {
    private String id;
    private String email;
    private String pswd;
    private String name;
    private int age; //tirar idade de birthday
    private HashSet<Usuario> contatos;
    private HashSet<Filme> filmesFavoritos;

    Usuario(Filme filme, String name, Date birthday, String pswd){
        this.name = name;
        this.filmesFavoritos = new HashSet<Filme>();
        this.pswd = pswd;
        contatos = new HashSet();
    }

    //gestão de contatos e filmes
    public void adicionarContato(Usuario usuario){
        contatos.add(usuario);
        //database.update (implementar)
    }
    public void removerContato(Usuario contato){
        contatos.remove(contato);
        //database.update (implementar)
    }

    public void favoritarFilme(Filme filme){
        filmesFavoritos.add(filme);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
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
