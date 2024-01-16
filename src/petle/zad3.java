package petle;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        String liczba;

        do {
            System.out.println("Wpisz tak lub nie: ");
            liczba = produkt.nextLine();

        }
        while (!liczba.equals("tak") && !liczba.equals("nie") );

        System.out.println("Liczba sie zgadza");
        produkt.close();
    }
}
