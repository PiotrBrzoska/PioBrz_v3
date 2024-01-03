import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Podaj cenę produktu: ");
        double cena = produkt.nextInt();

        System.out.println("Cena produktu z podatkiem stanowym: " + (cena*0.04));
        System.out.println("Cena produktu z podatkiem lokalnym: " + (cena*0.02));
        System.out.println("Łączna cena sprzedaży: " + (cena*0.06));


    }
}
