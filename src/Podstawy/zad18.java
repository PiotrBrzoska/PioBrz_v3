package Podstawy;

public class zad18 {
    public static void main(String[] args) {

        double cena = 600;
        double cena1 = 21.77;
        double akcja = cena * cena1;
        double prowizja = akcja * 0.02;
        double akcja1 = prowizja + akcja;
        System.out.println("Cena za akcje bez prowizji: "+ akcja);
        System.out.println("Cena prowizji: "+ prowizja);
        System.out.println("Cena za akcje z prowizją: "+ akcja1);

    }
}
