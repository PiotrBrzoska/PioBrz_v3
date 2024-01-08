import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Ile ciastek zjadłeś: ");
        int ciastko = produkt.nextInt();

        int kcal = ciastko * 300;

        System.out.println("Zjadłeś: " + kcal + " kalorii");
    }
}
