/*
Prosta klasa, do której tworzymy Testy JUnit Jupiter do poćwiczenia
 */

public class DzialaniaMatematyczne {

    public int dodawanie(int a, int b) {
        return a + b;
    }

    public int odejmowanie(int a, int b) {
        return a - b;
    }

    public int mnożenie(int a, int b) {
        return a * b;
    }

    public int dzielenie(int a, int b) {
        return a / b;
    }

    public double obliczPowierzchnieKola(double radius) {
        return Math.PI * radius * radius;
    }
}
