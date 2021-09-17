package com.ipiecoles.java.java220;
import org.joda.time.LocalDate;
public class Technicien extends Employe {

    private Integer grade;
    public Technicien(){

    }

    public Technicien(String nom, String prenom, String matricule,
                      LocalDate dateEmbauche, Double salaire, Integer grade) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public void setSalaire(Double salaire) {
        //Grade n'est pas null... Salaire ne soit pas null
        super.setSalaire(salaire * (1 + grade / 10d)); // pour modifier salaire, je n'ai pas d'autre option que de faire appel au setsalaire de la super classe. je ne peux pas faire this.salaire
    }

    @Override
    public Double getPrimeAnnuelle() {
        return super.getPrimeAnnuelle() * (1 + grade / 10d)
                + Entreprise.PRIME_ANCIENNETE * this.getNombreAnneeAnciennete();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
