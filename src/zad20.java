import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Podaj liczbę ciastek: ");
        double cena = produkt.nextInt();

        double ciastka = cena / 48;
        double cukier = 1.5 * ciastka;
        double maslo = 1 * ciastka;
        double maka = 2.75 *  ciastka;

        System.out.println("Potrzebujesz: " + cukier + " szklanki cukru "+ maslo + " szklanki masła "+ maka +" szklanki mąki");






    }
}
