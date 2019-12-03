/*
Cwiczenia wykonywania testów Junit Jupiter dla klasy Kąt Godzinowy
 */

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class KatGodzinowyTest {

    KatGodzinowy katMiedzyWskazowkami;

    @BeforeEach
    void init() {
        katMiedzyWskazowkami = new KatGodzinowy();
    }

    @Test
    @DisplayName("Godzina od 0 do 11, Minuty od 0 do 59.")
    void testujObliczanieKataMiedzyWskazowkami1() {
        int wynikObliczen = KatGodzinowy.katMiedzyWskazowkami(3, 43);
        assertEquals(146, wynikObliczen, "Metoda powinna zwracac kąt z zakresu 0 - 360 stopni.");
    }

    @Test
    @DisplayName("Godzina od 12 do 23, Minuty od 0 do 59.")
    void testujObliczanieKataMiedzyWskazowkami2() {
        int wynikObliczen = KatGodzinowy.katMiedzyWskazowkami(13, 3);
        assertEquals(13, wynikObliczen, "Metoda powinna zwracac kąt z zakresu 0 - 360 stopni.");
    }


    @Test
    @DisplayName("Wiele testów w jednej metodzie")
    void zrobWieleTestów() {
        assertAll(
                () -> assertEquals(146, KatGodzinowy.katMiedzyWskazowkami(3, 43)),
                () -> assertEquals(13, KatGodzinowy.katMiedzyWskazowkami(13, 3))
                );
    }
}