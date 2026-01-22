package Oppgave3;

public class algoritmen {

    //a
    //Hva er størrelsesorden uttrykt i O-notasjon (dvs. vi behøver ikke finne c og n) for algoritmen når
    //vekstfunksjonene er gitt som:
    //i. 4𝑛2 + 50𝑛 − 10
    //ii. 10𝑛 + 4 log2 𝑛 + 30
    //iii. 13𝑛3 + 22𝑛2 + 50𝑛 + 20
    //iv. 35 + 13log2 𝑛



    //b
    //Gitt følgende algoritme:
    sum = 0;
    for (int i = n; i > 1; i = i/2) {
        sum = sum + i;
    //Finn antall tilordninger (=) for algoritmen og effektiviteten uttrykt i O-notasjon. Begrunn svaret.



    //c
    //Gitt følgende algoritme:
        //Finn antall tilordninger (=) for algoritmen og effektiviteten uttrykt i O-notasjon. Begrunn svaret.
    sum = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j = j * 2) {
            sum += i * j;
        }
    }



    //d
    //Vi ser på en sirkel med radius r. Da vil areal og omkrets være gitt med formlene:
    //2𝜋𝑟2 og 2𝜋𝑟
    //Angi i stor O-notasjon hvordan areal og omkrets vokser. Dette har ikke direkte med en algoritme å
    //gjøre, men er med for å sjekke om dere har forstått begrepene vekstfunksjon og stor O-notasjon.
    //Oppgaven er svært lett om dere har skjønt begrepene.


    //e
    //Følgende metode avgjør om en tabell med n elementer inneholder minst ett duplikat:
        //Finn antall sammenligninger i verste tilfelle for algoritmen og effektiviteten uttrykt i O-notasjon.
        //Begrunn svaret.
        boolean harDuplikat(int tabell[], int n) {
        for (int indeks = 0; indeks <= n - 2; indeks++) {
            for (int igjen = indeks + 1; igjen <= n - 1; igjen++) {
                if (tabell[indeks] == tabell[igjen]) {
                    return true;
                }
            }
        }
        return false;
    }


    //f
        //Vi ser på tidskompleksiteten for vekstfunksjoner til 4 ulike algoritmer (for en viktig operasjon) der n
        //er antall elementer.
        //i. 𝑡1(𝑛) = 8𝑛 + 4𝑛3
        //ii. 𝑡2(𝑛) = 10 log2 𝑛 + 20
        //iii. 𝑡3(𝑛) = 20𝑛 + 2𝑛 log2 𝑛 + 11
        //iv. 𝑡4(𝑛) = 4 log2 𝑛 + 2𝑛
        //Hva er O-notasjonen for de ulike vekstfunksjonene?
        //Ranger vekstfunksjonene etter hvor effektive de er (fra best til verst). Anta at n er stor.




    //g
        public static void tid(long n) {
// …fyll ut
            long k = 0;
            for (long i = 1; i <= n; i++) {
                k = k + 5;
            }
// …fyll ut
// }
//oppgave 3 long desription we should just check it out



}
