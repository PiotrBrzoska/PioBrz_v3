package IFzadania;

import java.util.Scanner;

public class ifzad17 {
    public static void main(String[] args) {
        Scanner produkt = new Scanner(System.in);

        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?  ");
        String masa1 = produkt.next();
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?  ");
        String masa2 = produkt.next();
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?  ");
        String masa3 = produkt.next();

        if(masa1.equals("tak") & masa2.equals("tak") & masa3.equals("tak")){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa1);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa2);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ masa3);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Kawiarnia na Rogu\n" +
                               "Kuchnia u Szefa");

        }
        else if(masa1.equals("tak") & masa2.equals("nie") & masa3.equals("tak")){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa1);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa2);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ masa3);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Pizzeria przy Dworcowej");

        }
        else if(masa1.equals("tak") & masa2.equals("nie") & masa3.equals("nie")){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa1);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa2);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ masa3);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Włoskie Specjały");

        }
        else if(masa1.equals("nie") & masa2.equals("nie") & masa3.equals("nie")){
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa1);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa2);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ masa3);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Luksusowe Burgery u Jarka");

        } else  {
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa1);
            System.out.println("Czy któraś z osób jest na diecie wegetariańskiej:  "+ masa2);
            System.out.println("Czy któraś z osób jest na diecie bezglutenowej:  "+ masa3);

            System.out.println("Możecie wybrać się do następujących restauracji:  ");

            System.out.println("Nie możemy ci nic polecić");
        }


    }
    }

