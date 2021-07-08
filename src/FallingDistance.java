/**
 * Napisz metode fallingDistance, która jako argument przyjmuje czas spadania obiektu(w sekundach).Ta metoda powinna
 * zwracać odległość(w metrach), jaką przebył w tym czasie spadający obiekt. Zademonstruj działanie tej metody ,
 * wywołując ją w pętli, która przekazuje wartości od 1do 10 jako argument, a następnie wyświetla zwróconą wartość.
 * Wzór d=0.5gt2(kwadrat)
 */
public class FallingDistance {
    public static void main(String[] args) {
        double d; //odległość w metrach
        double g = 9.8; // stała
        double t; // czas spadania obiektu w sekundac
        double wynik;

        for (t = 1; t <= 10; t++) {

            wynik = fallingDistance(t, g);
            System.out.println(wynik);
        }
    }


    public static double fallingDistance(double czas, double s) {

        return 0.5 * s * (czas * czas);
    }

}
