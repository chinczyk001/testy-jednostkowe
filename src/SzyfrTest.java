import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfrTest {

    @Test
    void testSzyfrujCezaremKluczDodatniMniejszyOdDlugosciAlfabetu() {
        Assertions.assertEquals("def",Szyfr.szyfrujCezarem("abc",3));
    }
    @Test
    void testSzyfrujCezaremZawijanie() {
        Assertions.assertEquals("abc",Szyfr.szyfrujCezarem("xyz",3));
    }
    @Test
    void testSzyfrujCezaremOdszyfrowanie() {
        Assertions.assertEquals("abc", Szyfr.szyfrujCezarem("def", -3));
    }
    @Test
    void testSzyfrujCezaremKluczDluzszyOdDlugosciAlfabetu() {
        Assertions.assertEquals("def", Szyfr.szyfrujCezarem("abc",29));
    }
    @Test
    void testSzyfrujCezaremTekstZSpacja() {
        Assertions.assertEquals("cd ef", Szyfr.szyfrujCezarem("ab cd", 2));
    }
    @Test
    void testSzyfrujCezaremKluczUjemnyZZawijaniem() {
        Assertions.assertEquals("xyz",Szyfr.szyfrujCezarem("abc", -3));
    }
}