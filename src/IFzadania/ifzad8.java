package IFzadania;

import java.util.Scanner;

public class ifzad8 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("podaj czas w sekundach: ");
        double czas = produkt.nextInt();


        if(czas>100){

        double cena = czas * 99;
        double wynik = cena * 0.50;


        System.out.println("Przyznano rabat 50% do zapłaty: "+ wynik);

        }
        else if(czas>50){

            double cena = czas * 99;
            double wynik = cena * 0.40;


            System.out.println("Przyznano rabat 40% do zapłaty: "+ wynik);

        }
        else if(czas>20){

            double cena = czas * 99;
            double wynik = cena * 0.30;


            System.out.println("Przyznano rabat 30% do zapłaty: "+ wynik);

        }
        else if(czas>10){

            double cena = czas * 99;
            double wynik = cena * 0.20;


            System.out.println("Przyznano rabat 20% do zapłaty: "+ wynik);

        }
    }
}
