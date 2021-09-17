package com.exemple;

import com.ipiecoles.java.java220.Employe;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe(); //test pour voir si le constructeur Employe est bien public
        employe.getNombreAnneeAnciennete();//test pour voir si la methode getNombreAnneeAnciennete est bien public

        //déclaration de String
        String maChaine = "Bonjour";
        //Afficher maChaine
        System.out.println(maChaine);
        maChaine = "Au Revoir";
        //Afficher maChaine
        System.out.println(maChaine);
        maChaine = null;
        //Afficher maChaine
        System.out.println(maChaine);
        //Variable déclarée mais non initialisée
        Client c;

        //Instanciation d'un objet c à partir de la classe Client
        c = new Client();
        c.nom = "Durand";


        //Création d'un deuxieme client
        Client c2 = new Client();
        c2.nom = "Dupont";
        c2.prenom = "Christine";
        c2.numero = 654321;

        System.out.println((c2.calculReduction()));

        System.out.println("Nom C : " + c.nom);
        System.out.println("Prénom C : " + c.prenom);
        System.out.println("Numéro C : " + c.numero);

        System.out.println("Nom C2 : " + c2.nom);
        System.out.println("Prénom C2 : " + c2.prenom);
        System.out.println("Numéro C2 : " + c2.numero);
    }
}
