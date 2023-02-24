package TP2;

import java.util.Scanner;

public class Ex3_1_1 {
    public static void main(String[] args) {
        discriminant();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
        else if (delta == 0) {
            int x0 = ((-b)/2*a);
            System.out.println(x0);
        }
        else {
            int x0 = (int) (((-b) - Math.sqrt(delta))/2*a);
            int x1 = (int) (((-b) + Math.sqrt(delta))/2*a);
            System.out.println(x0);
            System.out.println(x1);
        }
    }
}