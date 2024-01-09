package IFzadania;

import java.util.Scanner;

public class ifzad5 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("podaj masę cieżaru w kg: ");
        double masa = produkt.nextInt();


        double ciezar = masa * 9.8;

        if(ciezar>1000){

            System.out.println("masa jest zbyt duża " + ciezar);
        } else if (ciezar<10) {
            System.out.println("masa jest zbyt mała " + ciezar);
        }
        else
        {
            System.out.println(ciezar);

        }

    }
}
