package TP2;

import java.util.Scanner;

public class Ex3_2_3 {
    public static void main(String[] args) {
        tableMultiplication();
    }

    public static void tableMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Afficher table de multiplication jusqu'à quel multiple ?");
        int n = scanner.nextInt();
        for (int i = 1 ; i != n+1; i++) {
            int x1 = 1*i;
            int x2 = 2*i;
            int x3 = 3*i;
            int x4 = 4*i;
            int x5 = 5*i;
            int x6 = 6*i;
            int x7 = 7*i;
            int x8 = 8*i;
            int x9 = 9*i;
            int x10 = 10*i;
            System.out.println(x1 + "    " + x2 + "    " + x3 + "    " + x4 + "    " + x5 + "    " + x6 + "    " + x7 + "    " + x8 + "    " + x9 + "    " + x10);
        }
    }

}
