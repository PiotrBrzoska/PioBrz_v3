package IFzadania;

import javax.print.DocFlavor;
import java.util.Scanner;

public class ifzad11 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("PODAJ CZASY I NAZWISKA BIEGACZY: ");
        double czas1 = produkt.nextDouble();
        String imie1 = produkt.next();
        double czas2 = produkt.nextDouble();
        String imie2 = produkt.next();
        double czas3 = produkt.nextDouble();
        String imie3 = produkt.next();

        if(czas1<czas2 & czas2<czas3){

            System.out.println("1: " + imie1 + " " + czas1);
            System.out.println("2: " + imie2 + " " + czas2) ;
            System.out.println("3: " + imie3 + " " +czas3);
        }
        else if(czas1<czas2 & czas2>czas3){

            System.out.println("1: " + imie1 + " " + czas1);
            System.out.println("2: " + imie3 + " " +czas3);
            System.out.println("3: " + imie2 + " " +czas2);
        }
        else if(czas2<czas3 & czas1<czas3){

            System.out.println("1: " + imie2 + " " +czas2);
            System.out.println("2: " + imie1 + " " +czas1);
            System.out.println("3: " + imie3 + " " +czas3);
        }
        else if(czas2<czas3 & czas1>czas3){

            System.out.println("1: " + imie2 + " " +czas2);
            System.out.println("2: " + imie3 + " " +czas3);
            System.out.println("3: " + imie1 + " " +czas1);
        }
        else if(czas3<czas2 & czas1<czas2){

            System.out.println("1: " + imie3 + " " +czas3);
            System.out.println("2: " + imie1 + " " +czas1);
            System.out.println("3: " + imie2 + " " +czas2);
        }
        else if(czas3<czas2 & czas1>czas2){

            System.out.println("1: " + imie3 + " " +czas3);
            System.out.println("2: " + imie2 + " " +czas2);
            System.out.println("3: " + imie1 + " " +czas1);
        }

    }
}
