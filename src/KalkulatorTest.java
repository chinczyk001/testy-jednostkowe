import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testSumaJezeliSumaLiczbCalkowitych() {
        Assertions.assertEquals(5, Kalkulator.suma(2,3));
    }
    @Test
    void testPodzielJezeliWynikCalkowity(){
        Assertions.assertEquals(3, Kalkulator.podziel(12, 4));
    }@Test
    void testPodzielJezeliWynikRzeczywisty(){
        Assertions.assertEquals(2.5, Kalkulator.podziel(10, 4));
    }
    @Test
    void testCzyPierwszaJezeliAniPierwszaAniZlozona() {
        Assertions.assertFalse(Kalkulator.czyPierwsza(1));
    }
    @Test
    void testCzyPierwszaJezeliParzystaIPierwsza(){
        Assertions.assertTrue(Kalkulator.czyPierwsza(2));
    }
    @Test
    void testCzyPierwszaJezeliKwadratLiczbyPierwszej(){
        Assertions.assertFalse(Kalkulator.czyPierwsza(25));
    }
    @Test
    void testCzyPierwszaJezeliPierwszaWiekszaOd2(){
        Assertions.assertTrue(Kalkulator.czyPierwsza(17));
    }
    @Test
    void testCzyPierwszaJezeliZlozona(){
        Assertions.assertFalse(Kalkulator.czyPierwsza(10));
    }

}