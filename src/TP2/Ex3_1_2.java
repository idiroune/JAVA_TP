package TP2;
import java.util.Scanner;

public class Ex3_1_2 {
    public static void main(String[] args) {
        parite();
    }
    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int nbr = scanner.nextInt();
        if (nbr % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
    }
}