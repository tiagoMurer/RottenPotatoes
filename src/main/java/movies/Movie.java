package movies;
import java.util.ArrayList;
import java.util.Collection;

import socialnetwork.*;

public class Movie {
    //VARI�VEIS

    private String name;
    private String director;
    private String sinopse;
    private double rate;
    Collection<Publication> comments = new ArrayList<Publication>();

    //CONSTRUCTOR
    public Movie(String name, String director, String sinopse){
        setName(name);
        setDirector(director);
        setSinopse(sinopse);
    }
    
    //GETTERS AND SETTERS

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }
    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }
    /**
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }
    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }
    /**
     * @param rate the rate to set
     */
    // IMPLEMENTAR MÉDIA DE AVALIALÇÃO
    public void atualizarRate(double rate) {
        this.rate = rate;
    }
    /**
     * @return the comments
     */
    public Collection<Publication> getComments() {
        return comments;
    }
    /**
     * @param comments the comments to set
     */
    public void setComments(Collection<Publication> comments) {
        this.comments = comments;
    }
}
