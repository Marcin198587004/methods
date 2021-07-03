/**
 * program ilustruje metode zwracajacą wartosc
 */
public class ValueReturn {
    public static void main(String[] args) {
        int total;
        int value1 = 20;
        int value2 = 40;

        total = sum(value1, value2);

        System.out.println("Suma liczb " + value1 + " i " + value2 + " wynosi " + total + ".");
    }
<<<<<<< HEAD

    /**
     * Metoda sum zwraca sume dwoch parametrow
     * @param num1 Pierwsza z dodawanych liczb
     ** @param num2 Druga z dodawanych liczb
     * @return Suma parametrów num1 i num2
     */
=======
>>>>>>> origin/master
   public static int sum(int num1,int num2)
{
    int result;
    result = num1 + num2;
    return result;

    }
}