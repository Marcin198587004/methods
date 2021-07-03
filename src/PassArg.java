public class PassArg {
    public static void main (String[] args) {

        int x = 10;
        System.out.println("Przekazywanie wartosci do metody displayValue,");

        displayValue(5);
        displayValue(x);
        displayValue(x * 4);
        displayValue(Integer.parseInt("700"));
        displayValue(800);
        System.out.println("To wszystko");
    }
        /**
         * Metoda displayValue wyświetla wartość jej całkowitoliczebnego parametru
         */
        public static void displayValue(int num)
        {
            System.out.println("Wartosć to " + num +".");
        }
    }

