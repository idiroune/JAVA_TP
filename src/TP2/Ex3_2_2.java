package TP2;

import java.util.Scanner;

public class Ex3_2_2 {
    public static void main(String[] args) {
        carres();
    }
    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier dont vous souhaitez avoir son carré");
        int x = scanner.nextInt();
        int x2 = x*x;
        System.out.print("Le carré de " + x + " est " + x2);
    }

}
