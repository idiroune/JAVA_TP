package TP2;

import java.util.Scanner;

public class Ex3_3_1 {
    public static void main(String[] args) {
        regle();
    }
    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Afficher une règle de combien de centimètres ?");
        int n = scanner.nextInt();
        int dizaine = 0;
        for (int i = 0 ; i != n+1; i++) {
            if (i == dizaine) {
                System.out.print("|");
                dizaine += 10;
            }
            else {
                System.out.print("-");
            }
        }
    }

}
