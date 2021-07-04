/**
 * Ten program ilustruje metode, która zwraca referencje do obiektu typu String
 */

public class ReturnString {
    public static void main(String[] args) {
        String customerName;

        customerName = fullName("Marcin", "Kamiński");
        System.out.println(customerName);
    }

    /**
     * Metoda fulName przyjmuje dwa argumebty typu String
     * zawierające imie i nazwisko .Metoda łączy je w jeden obiekt typu String
     * @param first Imię
     * @param last Nazwisko
     * @return Referencja do obiektu typu String zawierająca imie i nazwisko
     */
    public static String fullName(String first,String last) {
        String name;
        name = first + " " + last;
        return name;


    }
}

