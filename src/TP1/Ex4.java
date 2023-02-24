package TP1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Lis le contenu de la console*/
        System.out.println("entree un entier");
        /*Sors la valeur dans la console"*/
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);

        System.out.println("Bonjour, quel est votre prénom ?");
        String prenom = scanner.nextLine();
        System.out.println("« Bonjour," + prenom);

    }
}