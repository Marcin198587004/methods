/**
 * Napisz program który wyswietla prośbę o wpisanie wyników pięciu testów. Prgram powinien wyswietlic ocene
 * z kazdego testu i średnia z wszystkich testów.Napisz w programie następujące metody:
 * * calcAverage - powinna przyjmować jako argumenty piec wynikow testow i zwracać ich średnią
 * * determineGrade - powinna przyjmować jako argument wynik testu i zwracać ocene zgodnie ze skalą:
 * 90-100=5 | 80-89 =4 | 70-79=3 | 60-69 = 2 | poniżej 60 =1.
 */

import javax.swing.*;

public class wynikTestu {
    public static void main(String[] args) {


        double srednia; // srednia ze wszystkich testów
        String input; //przechowywanie danych
        int i;
        double totalI = 0.0; //przypisanie 0 do akumulatora
        double sred;
        double sred2;
        for (i = 1; i <= 5; i++) {


            input = JOptionPane.showInputDialog("Wprowadz wynik testu nr " + i);
            srednia = Double.parseDouble(input);
            totalI += srednia;
        }

        sred = calcAverage(totalI);
        determineGrade();

        JOptionPane.showMessageDialog(null, "Srednia z testów: " + sred);

    }

    public static double calcAverage(double sr) {
        return sr / 5;
    }

    public static void determineGrade() {
        String input;
        double srednia;
        input = JOptionPane.showInputDialog("Wprowadz wynik testu aby uzyskac ocene: ");
        srednia = Double.parseDouble(input);
        if (srednia >= 90 & srednia <= 100)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 5");

        else if (srednia > 80 & srednia <= 89)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 4");

        else if (srednia > 70 & srednia <= 79)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 3");

        else if (srednia > 60 & srednia <= 69)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 2");

        else if (srednia < 60)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 1");


    }
}
