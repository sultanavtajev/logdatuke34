package ukeoppgaver34;

/*
Sjekk at Programkode 1.1.5 gir korrekte resultater.
Hva skjer hvis a har lengde 1 og hva hvis a er tom (lengde 0).
 */

public class Oppgave1151 {
    public static int maks(int[] a){  // versjon 3 av maks-metoden
        int sist = a.length - 1;      // siste posisjon i tabellen 9
        int m = 0;                     // indeks til største verdi 0
        int maksverdi = a[0];        // største verdi 1
        int temp = a[sist];          // tar vare på siste verdi 10
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist 2147483647

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    if(temp >= maksverdi){
                        temp = sist;
                    } else {
                        temp = m;
                    }                         // er siste størst?
                    return temp;
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

    public static void main(String[] args) {
        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] c = {1, 3, 2, 7, 5, 9, 6, 8, 10, 4};
        int[] d = {1}; //Array med lengde 1
        int[] e = {}; //Array med lengde 0. Gir feilmelding.

        System.out.println("Indeks til største tall i tabellen er: " + maks(a));
        System.out.println("Indeks til største tall i tabellen er: " + maks(b));
        System.out.println("Indeks til største tall i tabellen er: " + maks(c));
        System.out.println("Indeks til største tall i tabellen er: " + maks(d));
        System.out.println("Indeks til største tall i tabellen er: " + maks(e));

    }

}
