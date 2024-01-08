import java.util.Scanner;

    public class zad12 {
        public static void main(String[] args) {
            Scanner produkt = new Scanner(System.in);

            System.out.println("Ile kilometrów przyjechałeś: ");
            int cena = produkt.nextInt();

            System.out.println("Ile litrów paliwa zużyłeś: ");
            int paliwo = produkt.nextInt();
            int litr = paliwo / cena;

            System.out.println("Zużyłeś " + litr + " litrów paliwa na kilometr");


        }
    }


