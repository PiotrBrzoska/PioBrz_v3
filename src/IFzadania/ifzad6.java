package IFzadania;

import java.util.Scanner;

public class ifzad6 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("podaj czas w sekundach: ");
        int czas = produkt.nextInt();

        int dni = 0;
        int godziny= 0;
        int minuty = 0;
        int sekundy= 0;
        if (czas > 86400) {

            dni = czas / 86400;

        } else if (czas > 3600) {
            godziny = czas / 3600;
        } else if (czas > 60) {
            minuty = czas / 60;
        } else {

            sekundy = czas;
        }
        System.out.println(dni + " dni");
        System.out.println(godziny + " godziny");
        System.out.println(minuty + " minuty");
        System.out.println(sekundy + " sekundy");


    }
}
