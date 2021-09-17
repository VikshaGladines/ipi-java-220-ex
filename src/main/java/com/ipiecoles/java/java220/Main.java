package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe();
//Setter
        employe.setNom("Doe");
        employe.setPrenom("John");
        try {
            employe.setDateEmbauche(new LocalDate(2020, 12, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Employe employe2 = new Employe("Doe", "Jane", "M12345", LocalDate.now(), 2000.0);
        //employe2 va prendre le constructeur Employe avec les 5 parametres, pas besoins de rappeler les valeurs juste de citer les valeurs voulu dans l'ordre des parametre du constructeur Employe

        //Getter
        System.out.println(employe2.getNom());
        System.out.println(employe2.getPrenom());
        System.out.println(employe2.getMatricule());

        System.out.println(employe2.getDateEmbauche().getYear());
        System.out.println(employe2.getSalaire());
        System.out.println(employe2.getNombreAnneeAnciennete());


        Employe employe1 = new Employe();
        employe1.setPrenom("John");
        employe1.setNom("Doe");


        employe2.setPrenom("John");
        employe2.setNom("Doe");
        if(employe1.equals(employe2)){
            System.out.println("Employés égaux");
        } else {
            System.out.println("Employés différents !");
        }

        String chaine1 = new String("Coucou");
        String chaine2 = new String("Coucou");
        if(chaine1.equals(chaine2)){
            System.out.println("Chaînes égales");
        } else {
            System.out.println("Chaînes différentes !");
        }



        Integer integer1 = 128;//-127 et 127
        Integer integer2 = 128;
        if(integer1.equals(integer2)){
            System.out.println("Entiers égaux");
        } else {
            System.out.println("Entiers différents !");
        }

        System.out.println(employe1.toString());


    }
}
