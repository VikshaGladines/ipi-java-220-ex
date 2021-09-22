package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Commercial extends Employe {

    private Double caAnnuel;
    private Integer performance;
    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    public Commercial(){}

    @Override
    public Double getPrimeAnnuelle() {
        double prime = 500d;
        if (this.caAnnuel != null) {
            prime = Math.ceil(Math.max(prime, this.caAnnuel * 0.05));
        }
        return prime;
    }

    public Commercial(String nom, String prenom, String matricule,
                      LocalDate dateEmbauche, Double salaire, Double caAnnuel){
        //Appelle le constructeur à 5 paramètres de la classe employé
        super(nom, prenom, matricule, dateEmbauche, salaire);
        //Affectation de mon attribut caAnnuel
        this.caAnnuel = caAnnuel;
    }


    public Commercial(String nom, String prenom, String matricule,
                      LocalDate dateEmbauche, Double salaire, Double caAnnuel, Integer performance) {
        this(nom, prenom, matricule, dateEmbauche, salaire, caAnnuel);
        this.performance = performance;
    }


    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Commercial that = (Commercial) o;
        return Objects.equals(caAnnuel, that.caAnnuel) && Objects.equals(performance, that.performance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caAnnuel, performance);
    }

    public Boolean performanceEgale(Integer performance){
        return this.performance.equals(performance);
    }



}








