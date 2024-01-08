import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Podaj cenę płytki: ");
        double plytka = produkt.nextInt();

        double cena = plytka * 0.4;

        System.out.println("Zysk z płytki: " + cena);


    }
}
