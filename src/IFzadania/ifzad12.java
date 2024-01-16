package IFzadania;

import java.util.Scanner;

public class ifzad12 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Wpisz powietrze woda lub stal: ");
        String cos = produkt.nextLine();

        System.out.println("Podaj odleglosc: ");
        double odleglosc = produkt.nextDouble();

        switch(cos){

            case "powietrze":
                double czas = odleglosc/343;
                System.out.println("Czas potrzebny na pokonanie dystansu w powietrzu to: "+ czas);
                break;

            case "woda":
                double czas1 = odleglosc/1490;
                System.out.println("Czas potrzebny na pokonanie dystansu w wodzie to: "+ czas1);
                break;

            case "stal":
                double czas2 = odleglosc/5100;
                System.out.println("Czas potrzebny na pokonanie dystansu w stali to: "+ czas2);
                break;
            default:
                System.out.println("Nieprawidłowe dane");
                break;
        }
    }
}
