/*
Zadanie 1
    Napisz program oraz testy (Junit) który po podaniu godziny jako parametr (HH:mm) zwróci kąt jaki
    jest zawarty pomiędzy wskazówkami zegara (godzinową i minutową).
    Uruchomienie aplikacji ma być realizowane poprzez uruchomienie z linii poleceń :
    java jar zegar.jar 12:34
    aplikacja wyświetla na konsoli kąt dla zadanej godziny.
 */


public class KatGodzinowy {

    public static int katMiedzyWskazowkami(int godzina, int minuty) {

        int kat = 0;

        if ((godzina >= 0 && godzina < 12) && (minuty >= 0 && minuty < 60)) {
            double katMinutowy = minuty * 360 / 60;
            double katGodzinowy = ((godzina * 360 / 12) + ((katMinutowy / 360) * 30));
            kat = (int) Math.abs(katGodzinowy - katMinutowy);
            System.out.println(kat);
        } else if ((godzina >= 12 && godzina < 24) && (minuty >= 0 && minuty < 60)) {
            double katMinutowy = minuty * 360 / 60;
            double katGodzinowy = (((godzina - 12) * 360 / 12) + ((katMinutowy / 360) * 30));
            kat = (int) Math.abs(katGodzinowy - katMinutowy);
            System.out.println(kat);
        } else {
            System.out.println("Niewłaściwy zakres godzin lub minut.");
        }
        return kat;
    }

    public static void main(String[] args) {
        katMiedzyWskazowkami(23, 37);
    }
}