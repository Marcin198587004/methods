/**
 * Ten program pokazuje,że do metody przekazywana jest tylko kopia argumentu
 */
public class PassByValue {
    public static void main(String[] args) {
        int number = 99; // początkowa wartosc zmiennej to 99

        //Wyświetlanie wartosci zmiennej number
        System.out.println("Wartość zmiennej number to: " + number);

        //wywoływanie metody changeMe ; jako argument przekazywana jest wartosc zmiennej number

        chengeMe(number);
        //ponowne wyswietlanie zmiennej number
        System.out.println("Wartość zmiennej number to: " + number);
    }

    public static void chengeMe(int myValue) {
        System.out.println("zmieniam wartosc.");
        myValue = 0; //zmiana wartosci parametru myValue na 0
        System.out.println("teraz wartosc wynosi " + myValue + ".");
    }

}
