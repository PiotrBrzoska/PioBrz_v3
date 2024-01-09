package Podstawy;

import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println(" podaj kwote pieniędzy początkowo zdeponowanej na koncie: ");
        double cena = produkt.nextInt();
        System.out.println(" podaj roczną stope oprocentowania,: ");
        double cena1 = produkt.nextInt();
        System.out.println(" podaj ile razy w roku odsetki są kapitalizowane (np. przy kapitalizacji miesięcznej wpisz 12,\n" +
                "                                               a przy kapitalizacji kwartalnej — 4),: ");
        double cena2 = produkt.nextInt();

        System.out.println(" podaj liczby lat, przez jakie środki będą znajdować się na koncie i generować odsetki: ");
        double cena3 = produkt.nextInt();

        double kwota1 =1 + cena1/cena2;
        double kwota = cena * kwota1;

        System.out.println("bedziesz posiadał: "+ kwota +" po "+cena3+ " latach");

    }

}
