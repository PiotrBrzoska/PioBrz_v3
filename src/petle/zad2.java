package petle;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        String liczba;

        do {
            System.out.println("Wpisz litere N,n lub T,t: ");
            liczba = produkt.nextLine();

        }
        while (!liczba.equals("N") && !liczba.equals("n") && !liczba.equals("T") && !liczba.equals("t"));

        System.out.println("Liczba sie zgadza");
        produkt.close();
    }
}