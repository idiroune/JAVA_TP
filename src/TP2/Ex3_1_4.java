package TP2;

import java.util.Scanner;

public class Ex3_1_4 {
    public static void main(String[] args) {
        egaliteStr();
    }
    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier mot : ");
        String Chaine1 = scanner.nextLine();
        System.out.print("Entrez le second mot : ");
        String Chaine2 = scanner.nextLine();

        boolean test1 = (Chaine1 == Chaine2); // <= true si dans la même variable (donc osef °\_'-'_/°)
        boolean test2 = Chaine1.equals(Chaine2);
        System.out.println(test1);
        System.out.println(test2);
    }
}