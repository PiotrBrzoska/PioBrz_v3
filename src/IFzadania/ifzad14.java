package IFzadania;

import java.util.Scanner;

public class ifzad14 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Wybierz pakiet A, B, C: ");
        System.out.println("• Pakiet A: Cena to 39,99 złotego miesięcznie, w tym 450 darmowych minut.\n" +
                "Każda następna minuta kosztuje 0,45 złotego.\n" +
                "• Pakiet B: Cena to 59,99 złotego miesięcznie, w tym 900 darmowych minut.\n" +
                "Każda następna minuta kosztuje 0,40 złotego.\n" +
                "• Pakiet C: Cena to 69,99 złotego miesięcznie, brak limitu minut.");
        String cos = produkt.next();
        System.out.println("Podaj liczbe rozmów: ");
        double min = produkt.nextInt();

        switch (cos){

            case "A":
                System.out.println("Pakiet A: Cena to 39,99 złotego miesięcznie, w tym 450 darmowych minut.\n" +
                        "Każda następna minuta kosztuje 0,45 złotego");

                double  cena=39.99 + (0.45*(min-450));
                double  cena1=59.99 + (0.45*(min-900));
                double  cena2=69.99;
                double tak= cena - cena1;
                double tak1= cena - cena2;
                System.out.println("Przy zakupie pakietu B oszczedziłbyś: "+ tak);
                System.out.println("Przy zakupie pakietu C oszczedziłbyś: "+ tak);
                System.out.println("Cena za pakiet: "+ cena);

                break;

            case "B":
                System.out.println("Pakiet B: Cena to 59,99 złotego miesięcznie, w tym 900 darmowych minut.\n" +
                        "Każda następna minuta kosztuje 0,40 złotego.");


                    double  cena4=59.99 + (0.45*(min-900));
                    double  cena6 = 69.99;
                    double  tak3 = cena4 - cena6;
                System.out.println("Przy zakupie pakietu C oszczedziłbyś: "+ tak3);
                    System.out.println("Cena za pakiet: "+ cena4);


            case "C":
                System.out.println("Pakiet C: Cena to 69,99 złotego miesięcznie, brak limitu minut.");

                double  cena5 = 69.99;
                System.out.println("Cena za pakiet: "+ cena5);
                break;
        }

    }
}

