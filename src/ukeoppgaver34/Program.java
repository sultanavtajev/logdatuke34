package ukeoppgaver34;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }

    public static int antallMaks(int[] a)    // teller opp i a
    {
        int antall = 0;            // antall tall
        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++)    // går gjennom tabellen a
        {
            if (a[i] > maksverdi)    // a[i] er større enn største foran
            {
                antall++;              // har funnet et nytt tall
                maksverdi = a[i];      // oppdaterer maksverdi
            }
        }

        return antall;    // de som er større enn det største foran
    }

    public static int kostnader(int[] a)  // legges i class Program
    {
        int m = 0;
        for (int i = 1; i < a.length; i++) {}  // en tom blokk
        return m;
    }

    public static int maks1(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // maks

    public static int maks2(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

    public static int maks3(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

        public static void main(String ... args)   // hovedprogram
        {
            int n = 1000_000, antall = 2_000; // tabellstørrelse og gjentagelser
            long tid = 0;                    // for tidsmåling
            int a[] = randPerm(n);           // en permutasjon av 1, . .  n

            tid = System.currentTimeMillis();    // leser av klokken
            for (int i = 0; i < antall; i++) kostnader(a);
            tid = System.currentTimeMillis() - tid;    // medgått tid
            System.out.println("Faste kostnader: " + tid + " millisek");

            tid = System.currentTimeMillis();    // leser av klokken
            for (int i = 0; i < antall; i++) maks1(a);  // Programkode 1.1.2
            tid = System.currentTimeMillis() - tid;     // medgått tid
            System.out.println("Maks1-metoden: " + tid + " millisek");

            tid = System.currentTimeMillis();    // leser av klokken
            for (int i = 0; i < antall; i++) maks2(a);  // Programkode 1.1.4
            tid = System.currentTimeMillis() - tid;     // medgått tid
            System.out.println("Maks2-metoden: " + tid + " millisek");

            tid = System.currentTimeMillis();    // leser av klokken
            for (int i = 0; i < antall; i++) maks3(a);  // Programkode 1.1.5
            tid = System.currentTimeMillis() - tid;     // medgått tid
            System.out.println("Maks3-metoden: " + tid + " millisek");
        }
    }
