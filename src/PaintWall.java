/**
 * ////Kalkulator kosztów malowania////
 * Firma okreslila ze kazde 10 m2 pow sciany wymaga 1.5l farby i 8 godzin pracy. Koszty robocizny firma wycenia
 * na 18 zl za godzine. Napisz program który pozwala użytkownikowi wprowadzic liczbe pokojow do pomalowania i
 * cene farby za litr. Program tez powinien wyświetlac pytanie o powierzchnie kazdego pokoju w metrach kwadratowych.
 * W programie nalezy umiescic metody zwracające nastepujące dane:
 * liczbę potrzebnych litrów farby
 * liczbe potrzebnych godzin pracy
 * koszt farby
 * koszt robocizny
 * łączny koszt malowania
 */


import javax.swing.*;

public class PaintWall {
    public static void main(String[] args) {
        double surface; // powierzchnia ścian
        double paint; //cena za litr potrzebnej farby podana przez uzytkownika
        double time = 0.8; // ilośc godzin pracy
        double cost = 18; // koszt roboczogodziny
        int room; // ilosc pokoi
        String input; //przechowywanie danych wejsciowych
        double totalSurface; //łaczna powierzchnia scian (Akumulator)
        double work;
        double totalPaint;// łączna liczba potrzebnej farby
        double totalPaint2;// łączna cena farby
        double paint2 = 0.15;
        double totalWork;
        double lacznyKoszt;

        totalSurface = 0.0; //Przypisanie 0 do akumulatora

        // wyswietlenie prośby o podanie liczby pokojów.
        input = JOptionPane.showInputDialog("Podaj liczbę pokojów: ");
        room = Integer.parseInt(input);

        // wyswietlanie prosby o podanie ceny za litr farby
        input = JOptionPane.showInputDialog("Podaj cenę za litr farby: ");
        paint = Double.parseDouble(input);

        //wyswietlenie prośby o podanie powierzchni kazdego pokoju w m2
        for (int count = 1; count <= room; count++) {
            input = JOptionPane.showInputDialog("Podaj ilość m2 pokoju nr " + count);
            surface = Double.parseDouble(input);
            totalSurface += surface;
        }

        //metoda zwracająca liczbe potrzebnych litrów farby
        totalPaint = getPaint(paint2, totalSurface);

        //metoda licząca łączną cene potrzebnej farby
        totalPaint2 = getCostPaint(totalPaint, paint);

        //metoda zwracająca liczbe potrzebnych godzin pracy
        work = getWork(totalSurface, time);

        //metoda zwracajaca koszt robocizny
        totalWork = getCost(work, cost);

        //metoda zwracajaca łaczny koszt malowania
        lacznyKoszt = totalCost(totalPaint2, totalWork);

        JOptionPane.showMessageDialog(null, "Łączny koszt malowania wynosi: " + lacznyKoszt);

        JOptionPane.showMessageDialog(null, "Marcin uczy się programowć i cieszy się gdy mu coś" +
                " wychodzi");

        System.exit(0);
    }

    public static double getPaint(double iloscFarby, double iloscMetrow) {

        return iloscFarby * iloscMetrow;
    }

    public static double getWork(double iloscMetrow, double czas) {
        return iloscMetrow * czas;
    }

    public static double getCost(double iloscGodzin, double koszt) {
        return iloscGodzin * koszt;
    }

    public static double getCostPaint(double totalPaint, double kosztFarby) {
        return totalPaint * kosztFarby;
    }

    public static double totalCost(double cenaFarby, double robocizna) {
        return cenaFarby + robocizna;
    }
}


