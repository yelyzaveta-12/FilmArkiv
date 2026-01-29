package Oppgave3;

public class TidsTest {

    public static void main(String[] args) {

        int n = 100_000_000; // 10^8
        int k = 0;

        long startTid = System.nanoTime();

        for (int i = 1; i <= n; i++) {
            k = k + 5;   // konstant arbeid
        }

        long sluttTid = System.nanoTime();

        long tidNanosek = sluttTid - startTid;
        double tidSek = tidNanosek / 1_000_000_000.0;

        System.out.println("Tid brukt: " + tidSek + " sekunder");
    }
}
