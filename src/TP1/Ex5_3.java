package TP1;

import java.util.Scanner;

public class Ex5_3 {
    public static void main(String[] args) {
        division();
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volume d'un pavé droit");
        System.out.println("Veuillez saisir la Longueur");
        float Longueur = scanner.nextFloat();
        System.out.println("Veuillez saisir la Largeur");
        float Largeur = scanner.nextFloat();
        System.out.println("Veuillez saisir la Hauteur");
        float Hauteur = scanner.nextFloat();
        float Volume = Longueur * Largeur * Hauteur;
        System.out.println("Le volume du pavé droit" + Longueur + ", " + Largeur + " et " + Hauteur + " est égale à " + Volume);
    }
}