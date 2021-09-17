package com.exemple;

public class Client {
    //attribu Nom
     String nom; // => pas de valeur par defaut, return null

    //Prénom
     String prenom; // => null

    //Numéro
     Integer numero = 1; // valeur par defaut, return 1

    //int numero

    public Integer calculReduction (/*Integer numero*/){    //pas besoins de mettre numero en parametre, c'est un attribu
        if(numero < 2000000){
            return 10;
        }
        return 0;
    }
}
