package no.hvl.data102.filmarkiv.impl;

import java.util.ArrayList;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {

    private LinearNode<Film> forste;
    private int antall;

    public Filmarkiv2() {
        forste = null;
        antall = 0;
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public Film finnFilm(int nr) {
        LinearNode<Film> p = forste;

        while (p != null) {
            if (p.data != null && p.data.getFilmnr() == nr) {
                return p.data;
            }
            p = p.neste;
        }

        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        LinearNode<Film> ny = new LinearNode<>(nyFilm);
        ny.neste = forste;
        forste = ny;
        antall++;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        LinearNode<Film> p = forste;
        LinearNode<Film> prev = null;

        while (p != null) {
            if (p.data != null && p.data.getFilmnr() == filmnr) {
                if (prev == null) {
                    forste = p.neste;
                } else {
                    prev.neste = p.neste;
                }
                antall--;
                return true;
            }

            prev = p;
            p = p.neste;
        }

        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        return soek(delstreng, true);
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        return soek(delstreng, false);
    }

    private Film[] soek(String delstreng, boolean sokITittel) {

        String s = (delstreng == null) ? "" : delstreng.toLowerCase();

        ArrayList<Film> funn = new ArrayList<>();
        LinearNode<Film> p = forste;

        while (p != null) {

            Film film = p.data;
            if (film != null) {

                String felt = sokITittel ? film.getTittel() : film.getProdusent();

                if (felt != null && felt.toLowerCase().contains(s)) {
                    funn.add(film);
                }
            }

            p = p.neste;
        }

        Film[] resultat = new Film[funn.size()];
        for (int i = 0; i < funn.size(); i++) {
            resultat[i] = funn.get(i);
        }
        return resultat;
    }

    @Override
    public int antall(Sjanger sjanger) {
        int teller = 0;

        LinearNode<Film> p = forste;
        while (p != null) {
            if (p.data != null && p.data.getSjanger() == sjanger) {
                teller++;
            }
            p = p.neste;
        }

        return teller;
    }
}
