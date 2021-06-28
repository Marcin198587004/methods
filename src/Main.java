import javax.swing.JOptionPane;

//Ten program uzywa dwóch metod void

public class Main {

    public static void main(String[] args) {

        double salary; // Roczne wynagrodzenie
        int creditRating; // Ocena kredytowa
        String input; //Przechowywaniw danych wejsciowych od uzytkownika

        //Pobieranie rocznego wynagrodzenia
        input = JOptionPane.showInputDialog("jakie jest Twoje roczne wynagrodzenie");
        salary = Double.parseDouble(input);


        //Pobieranie oceny kredytowej
        input = JOptionPane.showInputDialog("Jaka jest Twoja ocena kredytowa w skali o 1 do 10 ?\n" +
                "(10 - bardzo wysoka, 1 - bardzo niska)");
        creditRating = Integer.parseInt(input);

//Okreslenie czy uzytkownik otrzyma karte kredytową
        if (salary >= 20000 && creditRating >= 7)
            qualify();
        else
            noQualify();

        System.exit(0);
    }
        //Metoda qualify informuje uzytkownika ze otrzyma karte

        public static void qualify()
        {
            JOptionPane.showMessageDialog(null,"Gratulacje otrzymales karte");
        }
//ta metoda informuje ze nie dostanie karty
        public static void noQualify()
        {
            JOptionPane.showMessageDialog(null,"Przykro nam. Nie otrzymasz karty");
        }
    }

