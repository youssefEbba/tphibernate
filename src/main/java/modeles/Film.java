package modeles;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class Film implements Serializable {
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer i) {
        id = i;
    }

    @Column
    String titre;

    public void setTitre(String t) {
        titre = t;
    }

    public String getTitre() {
        return titre;
    }

    
    @Column 
    String resume;
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Column 
    String genre;
    @Column
    Integer annee;

    public void setAnnee(Integer a) {
        annee = a;
    }

    public Integer getAnnee() {
        return annee;
    }

    @ManyToOne
    @JoinColumn(name = "code_pays")
    Pays pays;

    public void setPays(Pays p) {
        pays = p;
    }

    public Pays getPays() {
        return pays;
    }
    @ManyToOne
    @JoinColumn(name = "id_realisateur")
    Artiste realisateur;

    public Artiste getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Artiste realisateur) {
        this.realisateur = realisateur;
    }


 
}