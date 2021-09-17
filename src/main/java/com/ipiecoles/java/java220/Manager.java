package com.ipiecoles.java.java220;
import java.util.HashSet;
public class Manager extends Employe {

    private HashSet<Technicien> equipe = new HashSet<>(); //garder la valeur par defaut pour les collections

    public void ajoutTechnicienEquipe(Technicien technicien){
        //Ajouter dans l'équipe
        equipe.add(technicien);
    }

    @Override
    public Double getPrimeAnnuelle() {
        return super.getPrimeAnnuelle()
                + Entreprise.PRIME_MANAGER_PAR_TECHNICIEN * equipe.size();
    }

    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }
}