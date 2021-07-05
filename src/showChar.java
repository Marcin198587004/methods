/**
 * Napisz metode showCar. Powinna ona przyjmować dwa argumenty: referencję do obiektu typu String i liczbę całkowita.
 * Argument w postaci liczby całkowitej określa pozycję znaku w obiekcie typu String.Metoda ma wyświetlać znak z
 * podanej pozycji.
 */
public class showChar {
    public static void main(String[] args) {

        char city;


        city = showChar("Warszawa",  (char)6);
        System.out.println(city);
    }

    public static char showChar(String name, char l) {
        char letter;
        letter = name.charAt(l);
        return letter;
    }


}

