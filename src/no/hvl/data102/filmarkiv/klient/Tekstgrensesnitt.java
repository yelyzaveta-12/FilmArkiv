package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import java.util.Scanner;

public class Tekstgrensesnitt {

    private Scanner scanner = new Scanner(System.in);

    // Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
    public Film lesFilm(){

        System.out.println("Filmnr: ");
        int filmnr = scanner.nextInt();

        System.out.println("Tittel: ");
        String tittel = scanner.nextLine();

        System.out.print("Produsent: ");
        String produsent = scanner.nextLine();

        System.out.println("Description: ");
        String description = scanner.nextLine();

        System.out.print("Lanseringsår: ");
        int aar = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Filmselskap: ");
        String filmselskap = scanner.nextLine();

        System.out.println("Sjanger(Action, comedy etc.: ");
        String sj = scanner.nextLine();
        Sjanger sjanger = Sjanger.finnSjanger(sj);

        return new Film(filmnr, produsent, tittel,
        aar, sjanger, filmselskap);

    }
    // Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void skrivUtFilm(Film film) {
// TODO
    }
    // Skriver ut alle filmer med en spesiell delstreng i tittelen
    public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
// TODO
    }
    // Skriver ut alle Filmer av en produsent (produsent er delstreng)
    public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
// TODO
    }
    // Skriver ut en enkel statistikk som inneholder antall filmer totalt
// og hvor mange det er i hver sjanger.
    public void skrivUtStatistikk(FilmarkivADT arkiv) {
// TODO
    }
// osv ... andre metode
    scanner.close();
}
