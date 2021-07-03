public class Checkpoint {
    public static void main(String[] args) {
        int num1 = 99;
        int num2 = 15;
        System.out.println(num1 + " " + num2);
        myMethod(num1, num2);
        System.out.println(num1 + " " + num2);
    }

    public static void myMethod(double i, int d) {
        System.out.println(i + " " + d);
        i = 0;
        d = 0;
        System.out.println(i + " " + d);
    }
}
