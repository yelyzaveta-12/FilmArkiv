package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class Meny {

    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;
    public Meny(FilmarkivADT filmarkiv){
        tekstgr = new Tekstgrensesnitt();
        this.filmarkiv = filmarkiv;
    }
    public void start(){

        filmarkiv.leggTilFilm(new Film(1,"Laila", "Fear and Loathing in Las Vegas", 1998, Sjanger.ACTION, "Dunno" ));

        tekstgr.skrivUtStatistikk(filmarkiv);
    }
}
