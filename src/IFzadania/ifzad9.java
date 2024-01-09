package IFzadania;

import java.util.Scanner;

public class ifzad9 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("podaj mase paczki: ");
        double masa = produkt.nextInt();

        System.out.println("podaj odległosc w kilometrach: ");
        double droga = produkt.nextInt();

        if(masa<1){

        double koszt = (droga/500)*1.10;
        System.out.println("Koszt doręczenia to: "+ koszt);

        }
        else if(masa<3){

            double koszt = (droga/500)*2.20;
            System.out.println("Koszt doręczenia to: "+ koszt);

        }
        else if(masa<5){

            double koszt = (droga/500)*3.70;
            System.out.println("Koszt doręczenia to: "+ koszt);

        }
        else {
            double koszt = (droga/500)*3.80;
            System.out.println("Koszt doręczenia to: "+ koszt);

        }


    }
}
