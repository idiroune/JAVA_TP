package TP1;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        somme();
    }
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Addition entre 2 entiers");
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est égale à " + somme);
    }
}
