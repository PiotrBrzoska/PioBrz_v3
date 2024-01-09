package Podstawy;

import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println(" podaj długości rzędu w metrach: ");
        double dlugosc = produkt.nextInt();

        System.out.println(" podaj ilości miejsca zajmowanego przez okratowanie w metrach,: ");
        double okratowanie = produkt.nextInt();

        System.out.println(" podaj odległości między sadzonkami w metrach.: ");
        double sadzonki = produkt.nextInt();

        double sadzonka = (dlugosc-2*okratowanie) /sadzonki;

        System.out.println("W rzędzie zmieści się: "+ sadzonka+" sadzonek");


    }
}
