package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import java.util.Scanner;

public class Tekstgrensesnitt {

    private Scanner scanner = new Scanner(System.in);


    public Film lesFilm() {

        System.out.print("Filmnr: ");
        int filmnr = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tittel: ");
        String tittel = scanner.nextLine();

        System.out.print("Produsent: ");
        String produsent = scanner.nextLine();

        System.out.print("Lanseringsår: ");
        int aar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Filmselskap: ");
        String filmselskap = scanner.nextLine();

        System.out.print("Sjanger (ACTION, DRAMA, HISTORY, SCIFI): ");
        String sj = scanner.nextLine();
        Sjanger sjanger = Sjanger.finnSjanger(sj);

        return new Film(filmnr, produsent, tittel, aar, sjanger, filmselskap);
    }

    public void skrivUtFilm(Film film) {
        if (film != null) {
            System.out.println(
                    "Filmnr: " + film.getFilmnr()
                            + ", Produsent: " + film.getProdusent()
                            + ", Tittel: " + film.getTittel()
                            + ", År: " + film.getAar()
                            + ", Sjanger: " + film.getSjanger()
                            + ", Filmselskap: " + film.getFilmselskap()
            );
        }
    }

    public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {

        Film[] filmer = arkiv.soekTittel(delstreng);
        for (Film f : filmer) {
            skrivUtFilm(f);
        }
    }

    public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {

        Film[] filmer = arkiv.soekProdusent(delstreng);
        for (Film f : filmer) {
            skrivUtFilm(f);
        }
    }

    public void skrivUtStatistikk(FilmarkivADT arkiv) {

        System.out.println("Antall filmer totalt: " + arkiv.antall());
        for (Sjanger s : Sjanger.values()) {
            System.out.println(s + ": " + arkiv.antall(s));
        }
    }
}

  
