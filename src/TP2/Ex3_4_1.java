package TP2;

import java.util.Scanner;

public class Ex3_4_1 {
    public static void main(String[] args) {
        initialisationTableau();
    }
    public static void initialisationTableau() {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[20];
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        int max = tableau[0];
        int min = tableau[0];
        for (int i : tableau){
            if (i > max){
                max = i;
            }
            else if (i < min){
                min = i;
            }
        }
        System.out.println("Le maximum du tableau est " + max);
        System.out.println("Le minimum du tableau est " + min);

    }

}
