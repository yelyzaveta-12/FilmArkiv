package no.hvl.data102.filmarkiv.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.*;

public class FilmarkivTest {

    private FilmarkivADT arkiv;

    @BeforeEach
    public void setup() {

        //arkiv = new Filmarkiv(3);
        arkiv = new Filmarkiv2();

        arkiv.leggTilFilm(new Film(1, "Christopher Nolan", "Interstellar", 2014, Sjanger.SCIFI, "WB"));
        arkiv.leggTilFilm(new Film(2, "Laila", "Fear and Loathing in Las Vegas", 1998, Sjanger.ACTION, "VetIkke:-)"));
    }

    @Test
    public void testFinnFilm() {
        Film f = arkiv.finnFilm(1);
        assertNotNull(f);
        assertEquals("Interstellar", f.getTittel());
    }

    @Test
    public void testAntall() {
        assertEquals(1, arkiv.antall());
    }

    @Test
    public void testAntallSjanger() {
        assertEquals(1, arkiv.antall(Sjanger.SCIFI));
    }

    @Test
    public void testSoekTittel() {
        Film[] resultat = arkiv.soekTittel("Inter");
        assertEquals(1, resultat.length);
        assertEquals("Interstellar", resultat[0].getTittel());
    }

    @Test
    public void testSoekProdusent() {
        Film[] resultat = arkiv.soekProdusent("Nolan");
        assertEquals(1, resultat.length);
        assertEquals("Christopher Nolan", resultat[0].getProdusent());

    }

    @Test
    public void testSlettFilm() {
        assertEquals(1, arkiv.antall());

        boolean slettet = arkiv.slettFilm(1);
        assertTrue(slettet);

        assertEquals(0, arkiv.antall());
        assertNull(arkiv.finnFilm(1));
    }
}