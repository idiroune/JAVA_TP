package TP1;

import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        division();
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Division entre 2 entiers");
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est égale à " + somme);
    }
}