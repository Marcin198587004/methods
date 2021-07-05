/**
 * Kalkulator ceny detalicznej.
 * NApisz program, który wyświetla prosbę o wpisanie ceny hurtowej produktu i marży (w procentach).
 * Program powinien wyświetlić cenę detaliczną.
 */

import javax.swing.*;

public class CalculateReatail {
    public static void main(String[] args) {
        double cenaHurtowa;
        double marza;
        double cenaDetaliczna;


        cenaHurtowa = value1();
        marza = value2();
        cenaDetaliczna = calculateRetail(cenaHurtowa, marza);

        JOptionPane.showMessageDialog(null,"Cena detaliczna wynosi: " +cenaDetaliczna +" zł.");
        System.exit(0);
    }
    //pobieranie ceny hurtowej od uzytkownika
    public static double value1() {
        String input;
        double kwota;
        input = JOptionPane.showInputDialog("Wpisz cenę hurtową w zł: ");
        kwota = Double.parseDouble(input);
        return kwota;
    }

    //pobieranie wielkosci marży od uzytkownika
    public static double value2() {
        String input2;
        double procent;
        input2 = JOptionPane.showInputDialog("Wpisz wielkość marży (%): ");
        procent = Double.parseDouble(input2);
        return procent;
    }
    //Wylicznie ceny detalicznej
    public static double calculateRetail(double cenaHurtowa, double marza) {
        return cenaHurtowa * (marza/100) + cenaHurtowa;
    }
}

