package petle;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        int liczba;

        do {
            System.out.println("Wpisz liczbe z przedzialu od 10 do 24: ");
            liczba = produkt.nextInt();

        }
        while (liczba < 10 || liczba > 24);

            System.out.println("liczb miesci sie w przedziale");
            produkt.close();
        }
    }




