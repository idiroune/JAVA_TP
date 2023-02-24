package TP2;

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        factorielle();
    }
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Saisir un entier positif ou nul");
            n = scanner.nextInt();
        } while (n<0);
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

}
