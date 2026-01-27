package no.hvl.data102.filmarkiv.impl;

import java.util.ArrayList;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {

    private class Node {
        private Film data;
        private Node neste;

        private Node(Film data) {
            this.data = data;
            this.neste = null;
        }
    }

    private Node forste;
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
        Node p = forste;
        while (p != null) {
            if (p.data.getFilmnr() == nr) {
                return p.data;
            }
            p = p.neste;
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        Node ny = new Node(nyFilm);
        ny.neste = forste;
        forste = ny;
        antall++;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        Node p = finnNode(filmnr);
        if (p == null) {
            return false;
        }

        p.data = forste.data;
        forste = forste.neste;
        antall--;

        return true;
    }

    private Node finnNode(int filmnr) {
        Node p = forste;
        while (p != null) {
            if (p.data.getFilmnr() == filmnr) {
                return p;
            }
            p = p.neste;
        }
        return null;
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

        String s;
        if (delstreng == null) {
            s = "";
        } else {
            s = delstreng.toLowerCase();
        }

        ArrayList<Film> funn = new ArrayList<>();

        Node p = forste;
        while (p != null) {

            String felt;
            if (sokITittel) {
                felt = p.data.getTittel();
            } else {
                felt = p.data.getProdusent();
            }

            if (felt != null) {
                if (felt.toLowerCase().contains(s)) {
                    funn.add(p.data);
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

        Node p = forste;
        while (p != null) {
            if (p.data.getSjanger() == sjanger) {
                teller++;
            }
            p = p.neste;
        }

        return teller;
    }
}
