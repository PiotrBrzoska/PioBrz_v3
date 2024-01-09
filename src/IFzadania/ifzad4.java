package IFzadania;

import java.util.Scanner;

public class ifzad4 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("wynik 1 testu: ");
        double test1 = produkt.nextInt();

        System.out.println("wynik 2 testu: ");
        double test2 = produkt.nextInt();

        System.out.println("wynik 3 testu: ");
        double test3 = produkt.nextInt();

        double srednia = (test1+test2+test3)/3;

        if(srednia<=100 && srednia>=90){

            System.out.println("ocena 5");

        }
        else if(srednia<=89 && srednia>=80){

            System.out.println("ocena 4");

        }
        else if(srednia<=79 && srednia>=70){

            System.out.println("ocena 3");

        }
        else if(srednia<=69 && srednia>=60){

            System.out.println("ocena 2");

        }
        else{

            System.out.println("ocena 1");

        }

    }
}
