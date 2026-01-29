package Oppgave3;

Oppgave a)

i. 4𝑛^2 + 50𝑛 − 10
    Størrelsesorden i O-notasjon gir n * n, altså O(n^2).
    Dette er en andregradsligning, hvor 4n^2 vokser raskere enn 50n, og 10 er en konstant. 
    i java er dette typisk to nested for-loops hvor du har en løkke som gir en verdi
    og en annen løkke som gir en annen verdi. 

ii. 10𝑛 + 4 log2(𝑛) + 30
    Størrelsen i O-notasjon kan bli skrevet som O(n). Her vil 10n vokse lineært,
    log_2(n) vokse ekstremt sakte og 30 er en konstant. Verdien til n vil dominere utrykket.

iii. 13𝑛^3 + 22𝑛^2 + 50𝑛 + 20
    Størreslen i O-notasjon kan bli skrevet som n * n * n, altså O(n^3).
    Verdien til n har store innvirkninger for de 3 første leddene, mens 20 er en konstant.
    I java er dette typisk tre nested-loops. 

iv. 35 + 13log_2(𝑛)
    Størrelsen i O-notasjon kan bli skrevet som O(log(n)). I oppgave 2 var 10n > 4log2(n),
    og 4log2(n) hadde lite påvirkning til utrykket.
    I dette utrykket er det 13log_2(n) som avgjør størrelsen, mens 35 er en konstant. 


Oppgave b)
   
sum = 0;
for (int i = n; i > 1; i = i/2) {
sum = sum + i;

Når denne løkken kjøres, før vi først n, så n/2, så n/4, n/8 osv...,
siden summen er sum + i og i = i/2. 

La oss ta et eksempel hvor n = 2. 
i = 2, i > 1, sum = sum + i, sum = 2
i = i / 2, i = 1. Når n = 2, kjører løkken 1 gang.

Dersom n = 4, kjører løkken 2 ganger. 
Dersom n = 8, kjører løkken 3 ganger. 

Løkken kjører log_2(n) ganger, og operasjonen blir O(log n).


Oppgave c) 
   
sum = 0;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j = j * 2) {
sum += i * j;
}
}

I den indre løkken starter j på 1 og dobles, frem til j > n.
Dersom n = 2 vil j være 1, så 2, så 4, men siden 4 > 2 stopper løkken. 2 iterasjoner.
Dersom n = 4 vil j være 1, 2, 4, før den stopper på 8. 3 iterasjoner. 
Log_2(2) = 2
log_2(4) = 3

Den indre løkken kan bli skrevet som O(log n)

Så har vi den ytre løkken. i øker så lenge i <= n. Dette gir i = n, altså O(n). 

Dermed har vi O(log n) og O(n). Vi multipliserer de med hverandre,
siden den indre løkken kjøres for hver iterasjon av den ytre.
O(n) * O(log n) = O(n log n) 

Oppgave d)
Sirkel med radius r, areal og omkrets gitt med 2𝜋r^2 og 2𝜋r
double areal = 2 * Math.PI * r*r
double omkrets = 2 * PI * r

Variabelen r står for størrelsen til formlene, dermed blir O-notasjon:
O(r'2) for areal, og O(r) for omkrets


Oppgave e)

boolean har Duplikat(int tabell[], int n) {
for (int indeks = 0; indeks <= n - 2; indeks++) {
for (int igjen = indeks + 1; igjen <= n - 1; igjen++) {
if (tabell[indeks] == tabell[igjen]) {
return true;
}
}
}
return false;
} 

Siden første løkke har betingelse indeks <= n - 2 og andre løkke har betingelse igjen <= n - 1
konkluderer vi med at indeks alltid blir lik igjen
Derfor det verste tillfore er når de to er ikke lik. 



Oppgave f)
  
i. 𝑡1(𝑛) = 8𝑛 + 4𝑛^3. 
    Her er størrelsen til 4n^3 så mye større enn 8n.
    Dermed blir 4n^3 gjeldende ledd, og operasjonen blir O(n^3)
    
ii. 𝑡2(𝑛) = 10 log_2(𝑛) + 20
    Her er dominerende ledd log_2(n), dermed O(log n) 

iii. 𝑡3(𝑛) = 20𝑛 + 2𝑛 log_2(𝑛) + 11
    Her er dominerende ledd log_2(n), dermed O(n * log n) 

iv. 𝑡4(𝑛) = 4 log_2(𝑛) + 2𝑛
    Her er dominedende ledd 2n, dermed O(n)
    

I rekkefølge fra størst til minst: t1 - t3 - t4 - t2
   

Oppgave g))

Vi testet 10^7 og 10^8 på en relativt grei skole-laptop. 
Litt varierende resultater, men to av resultatene var: 
10^7 ble utført på 0.0079756 sekunder
10^8 ble utført på 0.0642961 sekunder

Vekstfunksjonen tid()-metoden T(n) = cn, der c er en konstant, kan c typisk være antall iterasjoner.
Utfallet til disse testene vil variere utifra hvor bra korttidsminnet PCen din har. 
 
