package TP2;

import java.util.Scanner;

public class Ex3_2_4 {
    public static void main(String[] args) {
        division();
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Division entre 2 nombres !");
        System.out.println("Saisissez un numérateur :");
        int num = scanner.nextInt();
        int den;
        do {
            System.out.println("Saisissez un dénominateur positif non nul :");
            den = scanner.nextInt();
        } while (den <= 0);
        float div = (float) num/den;
        System.out.println(div);
    }

}
