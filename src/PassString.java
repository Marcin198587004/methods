/**
 * Ten program pokazuje, że argumentóe typu String nie można modyfikować.
 */

public class PassString {
    public static void main(String[] args) {
        String name = "Szekspir";
        System.out.println("W metodzie main zmienna name wskazuje tekst "+ name);
        changeName(name);
        System.out.println("Ponownie w main. Zmienna wskazuje tekst "+ name );
    }

    public static void changeName(String str) {
        str = "Dickens";
        System.out.println("W metodzie changename zmienna name wskazuje tekst "+ str);
    }
}