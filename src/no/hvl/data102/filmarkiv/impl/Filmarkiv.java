package no.hvl.data102.filmarkiv.impl;


import no.hvl.data102.filmarkiv.adt.FilmarkivADT;


//implementing interface
//extending a class
public class Filmarkiv implements FilmarkivADT {

    private Film[] filmer;
    private int antall;

    public Filmarkiv(int kapasitet){
        filmer = new Film[kapasitet];
        antall = 0;
    }


    @Override
    public Film finnFilm(int nr) {
        for (int i = 0; i < antall; i++) {
            if (filmer[i].getFilmnr() == nr) {
                return filmer[i];
            }
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        if (antall == filmer.length) {
            utvid();
        }
        filmer[antall++] = nyFilm;
    }

    private void utvid() {
        Film[] ny = new Film[filmer.length * 2];
        for (int i = 0; i < filmer.length; i++) {
            ny[i] = filmer[i];
        }
        filmer = ny;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        for (int i = 0; i < antall; i++) {
            if (filmer[i].getFilmnr() == filmnr) {
                filmer[i] = filmer[antall - 1];
                filmer[antall - 1] = null;
                antall--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        Film[] temp = new Film[antall];
        int funnet = 0;

        for (int i = 0; i < antall; i++) {
            if (filmer[i].getTittel().toLowerCase()
                    .contains(delstreng.toLowerCase())) {
                temp[funnet++] = filmer[i];
            }
        }
        return trimTab(temp, funnet);
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        Film[] temp = new Film[antall];
        int funnet = 0;

        for (int i = 0; i < antall; i++) {
            if (filmer[i].getProdusent().toLowerCase()
                    .contains(delstreng.toLowerCase())) {
                temp[funnet++] = filmer[i];
            }
        }
        return trimTab(temp, funnet);
    }

    @Override
    public int antall(Sjanger sjanger) {
        int teller = 0;
        for (int i = 0; i < antall; i++) {
            if (filmer[i].getSjanger() == sjanger) {
                teller++;
            }
        }
        return teller;
    }

    @Override
    public int antall() {
        return antall;
    }

    private Film[] trimTab(Film[] tab, int n) {
        //n er antall elementer

        Film[] nytab = new Film[n];
        int i = 0;

        while(i <  n){
            nytab[i] = tab[i];
            i++;
        }
        return nytab;
    }
}
