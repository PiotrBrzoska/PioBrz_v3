package Podstawy;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Podaj wyniki z testów: ");
        int test = produkt.nextInt();
        int test1 = produkt.nextInt();
        int test2 = produkt.nextInt();

        int srednia = (test + test1 + test2)/3;

        System.out.println("Wynik z 1 testu: " + test);
        System.out.println("Wynik z 2 testu: " + test1);
        System.out.println("Wynik z 3 testu: " + test2);
        System.out.println("Średnia: " + srednia);



    }
}
