package modeles;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;


@Entity
public class Artiste {
    @Id
    int id ;
    @Column
    String nom ;
    @Column
    String prenom ;
    @Column(name = "annee_naissance")
    String annee;
    @Column
   
    @OneToMany(mappedBy ="realisateur")
    Set<Film> filmsDiriges;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAnnee() {
        return annee;
    }
    public void setAnnee(String annee) {
        this.annee = annee;
    }
  
    
}
