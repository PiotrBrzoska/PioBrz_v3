package IFzadania;

import java.util.Scanner;

public class ifzad10 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Podaj liczbę kcal: ");
        int kcal = produkt.nextInt();

        System.out.println("Podaj liczbę tłuszczu: ");
        int masa = produkt.nextInt();

        int tls = masa * 9;
        int tluszcz = (int) (tls*0.30);

        if(kcal<tls){

            System.out.println("Nieprawidłowe dane");

        }
        else if(tls < tluszcz){

            System.out.println("Produkt jest niskotłuszczowy tłuszcz ma "+tls+" kcal");

        }else{

            System.out.println("tłuscz ma "+tls+" kcal");
        }

    }
}
