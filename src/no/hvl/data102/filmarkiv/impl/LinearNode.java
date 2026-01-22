package no.hvl.data102.filmarkiv.impl;

public class LinearNode<Film>{

    public Film data;
    public LinearNode<Film> neste;

    public LinearNode(Film data) {
        this.data = data;
        this.neste = null;
    }
}
