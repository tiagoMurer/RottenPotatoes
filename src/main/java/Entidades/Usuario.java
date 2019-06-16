package Entidades;

public class Usuario {
    private int id;
    private String email;
    private String pswd;
    private int idPerfil;


    public Usuario(int id, String email, String pswd, int idPerfil){
    	this.id = id;
    	this.email = email;
        this.pswd = pswd;
        this.idPerfil = idPerfil;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public int getIdPerfil() {
		return idPerfil;
	}


	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}


	@Override
	public String toString() {
		return "Usuario [id: " + id + ", email: " + email + ", idPerfil: " + idPerfil + "]";
	}
	
	
}
