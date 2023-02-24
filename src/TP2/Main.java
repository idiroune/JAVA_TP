package TP2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel exercice voulez-vous ?");
        System.out.println("");
        System.out.println("1. Discriminant");
        System.out.println("2. Parité d’un nombre");
        System.out.println("3. Calcul d’extremum");
        System.out.println("4. Égalité entre chaînes de caractères");
        System.out.println("5. Factorielle");
        System.out.println("6. Compte à rebours");
        System.out.println("7. Valeurs de carrés");
        System.out.println("8. Table de multiplication");
        System.out.println("9. Division d’entiers");
        System.out.println("10. Règle graduée");
        System.out.println("11. Nombres premiers");
        System.out.println("12. Manipulations sur un tableau");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                Ex3_1_1.discriminant();
                break;
            case 2:
                Ex3_1_2.parite();
                break;
            case 3:
                Ex3_1_3.max();
                break;
            case 4:
                Ex3_1_4.egaliteStr();
                break;
            case 5:
                Ex3_2.factorielle();
                break;
            case 6:
                Ex3_2_1.countdown();
                break;
            case 7:
                Ex3_2_2.carres();
                break;
            case 8:
                Ex3_2_3.tableMultiplication();
                break;
            case 9:
                Ex3_3_1.regle();
                break;
            case 10:
                System.out.println("Osef");
                break;
            case 11:
                Ex3_4_1.initialisationTableau();
                break;
        }
    }
}
