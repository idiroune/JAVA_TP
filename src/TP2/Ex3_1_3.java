package TP2;
import java.util.Scanner;

public class Ex3_1_3 {
    public static void main(String[] args) {
        max();
    }
    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int x1 = scanner.nextInt();
        System.out.print("Entrez le second entier : ");
        int x2 = scanner.nextInt();
        if (x1 < x2)
            System.out.println("L'entier le plus élevé est "+ x2);
        else
            System.out.println("L'entier le plus élevé est "+ x1);
    }
}
