/*
Cwiczenia wykonywania testów Junit Jupiter dla klasy Działania Matematyczne
 */


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DzialaniaMatematyczneTest {

    DzialaniaMatematyczne dzialMat;     // tu tworzymy instancję klasy testującej

    @BeforeAll
    static void powyzszyTekstUruchamiaMetodeNaPoczatku() {
        System.out.println("Nalezy to uruchomic na samym poczatku");
    }

    @BeforeEach
    void inicjalizujemyTestowanaKlase() {
        dzialMat = new DzialaniaMatematyczne();
    }

    @AfterEach
    void powyzszyTekstUruchamiaMetodePoKazdymTescie() {
        System.out.println("Czyszczonko..");
    }

    @Test
    void testujDodawanie() {
        int oczekiwanaWartosc = 2;
        int wynikObliczen = dzialMat.dodawanie(1, 1);
        assertEquals(oczekiwanaWartosc, wynikObliczen, "Metoda powinna dodac dwie wartosci.");
    }

//    @Test
//    void testujDzielenie() {
//        assertThrows(NullPointerException.class, () -> dzialMat.dzielenie(1, 0), "Dzielenie przez zero jest niedozwolone.");
//    }

    @Test
    void policzPowierzchnieKola() {
        assertEquals(314.1592653589793, dzialMat.obliczPowierzchnieKola(10), "Powinien zwrocic powierzchnie kola.");
    }

    @Test
    @Disabled
    @DisplayName("TDD method. Nie powinno być uruchamiane")
    void testNieaktywny() {
        fail("Ten test jest nieaktywny.");
    }
}