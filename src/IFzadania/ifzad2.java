package IFzadania;

import java.util.Scanner;

public class ifzad2 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("podaj dzień: ");
        int liczba = produkt.nextInt();

        System.out.println("podaj miesiąc: ");
        int liczba2 = produkt.nextInt();

        System.out.println("podaj 2 ostatnie liczby roku: ");
        int liczba3 = produkt.nextInt();

        int data = liczba*liczba2;

        if(data==liczba3){
            System.out.println("data jest magiczna");
        }else{

            System.out.println("data nie jest magiczna");

        }
    }
}
