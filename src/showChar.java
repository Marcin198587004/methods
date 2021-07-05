/**
 * Napisz metode showCar. Powinna ona przyjmować dwa argumenty: referencję do obiektu typu String i liczbę całkowita.
 * Argument w postaci liczby całkowitej określa pozycję znaku w obiekcie typu String.Metoda ma wyświetlać znak z
 * podanej pozycji.
 */
public class showChar {
    public static void main(String[] args) {

        showChar("Warszawa", 4);

    }

    public static void showChar(String name, int l) {

        char letter = name.charAt(l);
        System.out.println(letter);

    }
}

