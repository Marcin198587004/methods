/**
 * Napisz metode celsius ,która jako argument przyjmuje temp w stopniach Farenheita. Ta metoda powinna zwracac
 * temperaturę przeliczoną w stopniach Celcsjusza. Zademonstruj działanie tej metody wywołując ja w pętli która
 * wyświetla tabelę z temperaturami od 0 do 20 w stopniach Farenheita i ich odpowiednikami w stopniach Celscjusza.
 * wzor: C= 5/9(F-32)
 */


public class Celsius {
    public static void main(String[] args) {
        double c; //temp w stopniach Celsjusza
        double f; //temp w stopniach Farenheita
        double wynik;
        double i;

        for (f = 0, i=0; f <= 20; f++,i++) {
            wynik = celsius(f);



                System.out.println("Stopnie Celsjusza: " + wynik+ "      stopnie Farenheita: "+ i );
        }
    }

    public static double celsius(double F) {
        return 5 * (F - 32) / 9;
    }
}
