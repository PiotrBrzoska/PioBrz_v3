package IFzadania;

import java.util.Scanner;

public class ifzad3 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("podaj swoją wagę: ");
        double waga = produkt.nextInt();

        System.out.println("podaj swój wzrost: ");
        double wzrost = produkt.nextInt();

        double wzrost1 = Math.pow(wzrost,2);

        double BMI = waga/wzrost1;

        if(BMI<18.5){

            System.out.println("BULK!");

        }
        else if(BMI>18.5 && BMI<25){

            System.out.println("gittt");

        }else{

            System.out.println("JUK CUT");
        }

    }
}
