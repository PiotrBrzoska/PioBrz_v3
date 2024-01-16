package IFzadania;

import java.util.Scanner;

public class ifzad7 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("PODAJ IMIONA: ");
        String imie1 = produkt.next();
        String imie2 = produkt.next();
        String imie3 = produkt.next();



        if(imie1.compareToIgnoreCase(imie2) < 0 & imie2.compareToIgnoreCase(imie3) < 0){

            System.out.println("1: " + imie1 );
            System.out.println("2: " + imie2 ) ;
            System.out.println("3: " + imie3 );
        }
        else if(imie1.compareToIgnoreCase(imie2) < 0 & imie2.compareToIgnoreCase(imie3) > 0){

            System.out.println("1: " + imie1);
            System.out.println("2: " + imie3 );
            System.out.println("3: " + imie2 );
        }
        else if(imie2.compareToIgnoreCase(imie3) < 0 & imie1.compareToIgnoreCase(imie3) < 0){

            System.out.println("1: " + imie2 );
            System.out.println("2: " + imie1 );
            System.out.println("3: " + imie3 );
        }
        else if(imie2.compareToIgnoreCase(imie3) < 0 & imie1.compareToIgnoreCase(imie3) > 0){

            System.out.println("1: " + imie2 );
            System.out.println("2: " + imie3 );
            System.out.println("3: " + imie1 );
        }
        else if(imie3.compareToIgnoreCase(imie2) < 0 & imie1.compareToIgnoreCase(imie2) < 0){

            System.out.println("1: " + imie3 );
            System.out.println("2: " + imie1 );
            System.out.println("3: " + imie2 );
        }
        else if(imie3.compareToIgnoreCase(imie2) < 0 & imie1.compareToIgnoreCase(imie2) > 0){

            System.out.println("1: " + imie3 );
            System.out.println("2: " + imie2 );
            System.out.println("3: " + imie1 );
        }

    }




}


