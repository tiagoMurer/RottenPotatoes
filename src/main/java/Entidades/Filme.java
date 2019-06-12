package Entidades;


import java.util.HashSet;

public class Filme {
    //VARI�VEIS

    private String nome;
    private int ano;
    private String genero;
    private String diretor;
    private int numeroFans;
    //private HashSet<Usuario> fans;

    //CONSTRUCTOR
    public Filme(String nome, int ano, String genero, String diretor){
    	this.nome = nome;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.numeroFans = 0;
       // this.fans = new HashSet();
    }


    
    //GETTERS AND SETTERS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getNumeroFans() {
        return numeroFans;
    }

    public void setNumeroFans(int numeroFans) {
        this.numeroFans = numeroFans;
    }
	@Override
	public String toString() {
		return "Filme [Nome: " + nome + ", Ano: " + ano + ", Gênero: " + genero + ", Diretor: " + diretor + ", Favoritos: "
				+ numeroFans;
	}
}
