
package com.ipiecoles.java.java220;
import org.joda.time.LocalDate; // importe l'attribu d'un autre package a celui là

import java.util.Objects;

public class Employe {

     private String nom;
     private String prenom;
     private String matricule;
     private Double salaire;
     private LocalDate dateEmbauche;



    public Employe(){ //essentiel pour créer l'employé de base (constructeur par defaut)

    }

    public Employe (String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;

    }

    public void augmeterSalaire(Double pourcentage){
        this.salaire = this.salaire * (1 + pourcentage);
    }

    public final Integer getNombreAnneeAnciennete(){
        return LocalDate.now().getYear() - this.dateEmbauche.getYear();

    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }
    public void setDateEmbauche(LocalDate dateEmbauche) throws Exception {
        if(dateEmbauche == null){
            throw new Exception("La date d'embauche ne peut pas être nulle");
        }
        if(dateEmbauche.isAfter(LocalDate.now())){
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
        }
        //Si le paramètre est une date antérieure ou égale à la date courante
        this.dateEmbauche = dateEmbauche;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Double getSalaire() {
        return salaire;
    }
    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return
                        Objects.equals(nom, employe.nom) &&
                        Objects.equals(prenom, employe.prenom) &&
                        Objects.equals(matricule, employe.matricule) &&
                        Objects.equals(dateEmbauche, employe.dateEmbauche) &&
                        Objects.equals(salaire, employe.salaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, matricule, dateEmbauche, salaire);
    }

    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employe{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", matricule='").append(matricule).append('\'');
        sb.append(", salaire=").append(salaire);
        sb.append(", dateEmbauche=").append(dateEmbauche);
        sb.append('}');
        return sb.toString();
    }
}



