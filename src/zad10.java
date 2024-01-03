import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner imie = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String firstname = imie.nextLine();
        imie.nextLine();

        System.out.println("Podaj drugie imie: ");
        String middlename = imie.nextLine();
        imie.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastname = imie.nextLine();

        System.out.println("Imie: " + firstname);
        System.out.println("drugie imie: " + middlename);
        System.out.println("nazwisko: " + lastname);

        char inicjal = firstname.charAt(0);
        char inicjal2 = middlename.charAt(0);
        char inicjal3 = lastname.charAt(0);


        System.out.println("inicjały: ");
        System.out.println("Imie: " + inicjal  );
        System.out.println("drugie imie: " + inicjal2 );
        System.out.println("nazwisko: " + inicjal3 );

    }
}
