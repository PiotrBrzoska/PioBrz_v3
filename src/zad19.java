public class zad19 {
    public static void main(String[] args) {

        double liczba = 12467;
        double kupno = 0.14;
        double cytrusowy = 0.64;

        double kupno1 = liczba * kupno;
        double kupno2 = kupno1 * cytrusowy;

        System.out.println("liczba ankietowanych: "+ liczba);
        System.out.println("Osoby kupujące przynajmniej jeden napój energetyczny tygodniowo: "+ kupno1);
        System.out.println("Osoby preferujące smak cytrusowy: "+ kupno2);


    }
}
