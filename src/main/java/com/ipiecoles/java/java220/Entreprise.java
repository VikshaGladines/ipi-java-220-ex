package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Entreprise {
    //Constante de classe
    public static final Double SALAIRE_BASE = 1480.27;
    public static final Integer NB_CONGES_BASE = 25;
    public static final Double INDICE_MANAGER = 1.3;
    public static final Double PRIME_MANAGER_PAR_TECHNICIEN = 250.0;
    public static final Double PRIME_ANCIENNETE = 100d;

    public static Double primeAnnuelleBase(){
        //diviser par 2d ou 2.0 pour eviter la division
        //entre deux entiers qui produisent un entier (donc le resultat n'aura pas de decimal)
        return LocalDate.now().getYear() / 2d; // le "d" apres le "2" permet de dire que le "2" est un double, on peut donc avoir des decimal dans un calcul
    }
}
