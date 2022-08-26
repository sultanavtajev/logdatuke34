package ukeoppgaver34;

/*
Lag en metode public static int[] minmaks(int[] a).
Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a.
Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største,
kan du returnere tabellen b definert ved:   int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?
 */

import java.util.Arrays;

public class Oppgave1135 {
    public static int[] minmaks(int[] a) {
        int sammenligning = a.length + (2*(a.length-1));
        int min = a[0]; // (1) tilordning
        int minindex = 0; // (1) tilordning
        int maks = a[0]; // (1) tilordning
        int maksindex = 0; // (1) tilordning

        for (int i = 1; i < a.length; i++) { // (1) tilordning + (n) sammenligninger + (n-1) addisjoner
            if (a[i] < min) { // (n-1) utførelse av funksjon*(1 indeksering + 1 indeksering + 1 sammenligning) = 3(n-1);
                min = a[i]; // (x) tilordning
                minindex = i; // (1) tilordning
            }
            if (a[i] > maks) { // (n-1) utførelse av funksjon*(1 indeksering + 1 indeksering + 1 sammenligning) = 3(n-1)
                maks = a[i]; // (x) tilordning
                maksindex = i; // (1) tilordning
            }
        }
        return new int[]{minindex, maksindex, min, maks,sammenligning}; // (4) tilordninger

        // Totalt antall operasjoner:
        // Linje 14: 1
        // Linje 15: 1
        // Linje 16: 1
        // Linje 17: 1
        // Linje 19: 1+(n)+(n-1)=1-1+n+n=2n
        // Linje 20: 3(n-1)=3n-3
        // Linje 21: x
        // Linje 22: 1
        // Linje 24: 3(n-1)=3n-3
        // Linje 25: x
        // Linje 26: 1
        // Linje 27: 4
        // Sum: 1+1+1+1+2n+3n-3+x+1+3n-3+x+1+4 = 4+8n+2x
    }

    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int[] alleverdier = minmaks(a);
        int[] index = {alleverdier[0], alleverdier[1]};
        int[] tall = {alleverdier[2], alleverdier[3]};
        int sammenligninger = alleverdier[4];


        System.out.println("Antall sammenligninger: " + sammenligninger);
        System.out.println("Minste og maks tall indeks: " + Arrays.toString(index));
        System.out.println("Minste og maks tall verdi: " + Arrays.toString(tall));
    }
}