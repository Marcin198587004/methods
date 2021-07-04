import javax.swing.*;

public class CupConverter {
    public static void main(String[] args) {
        double cups; //przechowywanie liczby szklanek
        double ounces; //przechowywanie liczby litrów


        //pobieranie liczby szklanek
        cups = getCups();

        //Przeliczanie szklanek na litry
        ounces = cupsToOunces(cups);
        //Wyswietlanie wynikow
        DisplayResults(cups, ounces);
        System.exit(0);
    }

    /**
     * Mewtoda getCups wyswietla prośbe o wprowadzenie liczby szklanek
     *
     * @return Liczba szklanek wprowadzona przez użytkownika
     */
    public static double getCups() {
        String input; // przechowywanie danych wejsciowych
        double numCups; // przechowywanie liczby szklanek

        //Pobieranie liczby szklanek od użytkownika
        input = JOptionPane.showInputDialog("Ten program przelicza szklanki na litry.\n" +
                "Uzywany jest do tego wzor:\n" +
                "1 szklanka = 0.24 litra.\n\n" +
                "Podaj liczbe szklanek: ");
        numCups = Double.parseDouble(input);
        //zwracanie liczby szklanek
        return numCups;
    }

    /**
     * Metoda cupsToOneces przelicza szklanki na litryna podstawie wzoru
     * 1 szklanka = 0.24 litra
     *
     * @param numCups Liczba przeliczanych szklanek
     * @return Liczba litrów
     */
    public static double cupsToOunces(double numCups) {
        return numCups * 0.24;
    }

    public static void DisplayResults(double cups, double ounces) {
        //Wyswietlanie liczby litrów
        JOptionPane.showMessageDialog(null, "szklanki: " + cups +
                "\n Litry:" + ounces);
    }
}
