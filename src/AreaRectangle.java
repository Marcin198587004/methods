import javax.swing.*;

/**
 * Ten program liczy pole powierzchni prostokąta.
 */
public class AreaRectangle {
    public static void main(String[] args) {
        double dlugosc;
        double szerokosc;
        double polepow;

        //Pobieranie od użytkownika długości ptostokata
        dlugosc = getLenght();

        //Pobieranie od użytkownika szerokosci prostokąta
        szerokosc = getWidth();

        //Metoda licząca pole powierzchni prostokąta
        polepow = getArea(dlugosc, szerokosc);

        //Wyswietlanie wyniku

        displayData(polepow);

        System.exit(0);
    }

    public static double getLenght() {
        String input;
        double bok1;
        input = JOptionPane.showInputDialog("Podaj długość boku prostokata: ");
        bok1 = Double.parseDouble(input);
        return bok1;
    }

    public static double getWidth() {
        String input;
        double bok2;
        input = JOptionPane.showInputDialog("Podaj szerokość boku prostokata ");
        bok2 = Double.parseDouble(input);
        return bok2;
    }

    public static double getArea(double dl, double szer) {
        return dl * szer;
    }

    public static void displayData(double wynik) {
        JOptionPane.showMessageDialog(null, "Pole prostokata wynosi " + wynik);
    }
}
