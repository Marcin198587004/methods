import javax.swing.*;

public class CreditCard {
    /**
     * Ten program uzywa dwóch metod void
     */
    public static void main(String[] args) {
        double salary; // Roczne wynagrodzenie
        int creditRating; //Ocena kredytowa
        String input; //Przechiowywanie danych wejsciowych od uzytkownika

        //Pobieranie rocznego wynagrodzenia od uzytkownika
        input = JOptionPane.showInputDialog("Jakie jest Twoje roczne wynagrodzenie ?");
        salary = Double.parseDouble(input);

        //Pobieranie oceny kredytowej od uzytkkownika (1 - 10)
        input = JOptionPane.showInputDialog("Jaka jest Twoja ocena kredytowa w skali od 1 do 10 ?\n" +
                "1 - bardzo mała ,10 - bardzo duża");
        creditRating = Integer.parseInt(input);

        //Określenie czy użytkownik otrzma karte kredytową
        if (salary > 20000 && creditRating >= 7)
            qualify();
        else
            noqualify();
        System.exit(0);
    }

    /**
     * Metoda qualify informuje użytkownika o tym, ze otrzyma on karte kredytową
     */
    public static void qualify() {
        JOptionPane.showMessageDialog(null, "Gratulacje. Spełniasz warunki " +
                "do uzyskania karty kredytowej");
    }

    /**
     * Metoda noqualify informuje użytkownika, że nie otrzyma on karty kredytowej
     */
    public static void noqualify() {
        JOptionPane.showMessageDialog(null, "Przykro na ale nie spełmiasz warunków" +
                "do uzyskania karty kredytowj");
    }
}