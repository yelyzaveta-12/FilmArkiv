package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {

    private int antall;
    private LinearNode<Film> start;

    public Filmarkiv2() {
        start = null;
        antall = 0;
    }

    // implement ALL methods from FilmarkivADT

}
