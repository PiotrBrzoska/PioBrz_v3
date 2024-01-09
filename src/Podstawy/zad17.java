package Podstawy;

import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Podaj cenę z rachunku: ");
        double cena = produkt.nextInt();

        double podatek = cena * 0.0675;
        double napiwek = cena * 0.20;
        double zaplata = cena + podatek + napiwek;

        System.out.println("Cena posiłku: "+ cena);
        System.out.println("Cena podatku: "+ podatek);
        System.out.println("Cena napiwku: "+ napiwek);
        System.out.println("Kwota do zapłaty: "+ podatek);

    }
}
