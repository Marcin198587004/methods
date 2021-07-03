public class PassArgs {
    public static void main(String[] args) {

        showSum(5, 10);
    }

    /**
     * przekazywanie wielu argumentów
     * @param num1 pierwsza liczba
     * @param num2 druga liczba
     */
    public static void showSum(double num1, double num2) {

        double sum;
        double sum2;
        sum = num1 + num2;
        System.out.println("Suma dwóch liczb: " + sum);

        sum2 = num1 * num2;
        System.out.println("Iloczyn dwóch liczb: " +sum2);
        /**
         * Wypisanie liczb w konsoli
         */
        System.out.println("Wypisanie liczb: " + num1+"," + " "+num2);
    }
}