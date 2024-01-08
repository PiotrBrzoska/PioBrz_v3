import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Podaj nazwę miasta: ");
        String miasto = produkt.next();

        int dlugosc = miasto.length();
        String male = miasto.toLowerCase();
        String duze = miasto.toUpperCase();
        char inicjal = miasto.charAt(0);


        System.out.println("Liczba liter: "+ dlugosc);
        System.out.println("Duże litery: "+duze);
        System.out.println("Małe litery: "+male);
        System.out.println("Iniciały: "+ inicjal);

    }
}
