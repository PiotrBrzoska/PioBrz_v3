public class zad22 {
    public static void main(String[] args) {

        double akcje = 1000;
        double cenazaakcjie = 32.87;
        double prowizja = akcje * 0.02;

        double kupno = 1000*32.87;
        double prowizjakupna = kupno*0.02;
        double cenakupna = kupno + prowizjakupna;

        double sprzedarz = 1000*33.92;
        double prowizjasprzedarzy = kupno*0.02;
        double sprzedarzprowizja = sprzedarz - prowizjasprzedarzy;

        double zysk = sprzedarzprowizja - cenakupna;

        System.out.println("Kwota za akcje: " + cenakupna);
        System.out.println("Prowizja za kupione akcje: " + prowizjakupna);
        System.out.println("Kwota za sprzedane akcje: " + sprzedarzprowizja);
        System.out.println("Prowizja za sprzedaży akcje: " + prowizjasprzedarzy);
        System.out.println("Strata: " + zysk);

    }
}
