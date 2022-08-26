package ukeoppgaver34;

/*
Hvor mange grunnleggende operasjoner utfører Programkode 1.1.4 hvis tabellen a inneholder
i) 10, 5, 7, 2, 9, 1, 3, 8, 4, 6
ii) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
iii) 1, 3, 2, 7, 5, 9, 6, 8, 10, 4

Sammenlign med svarene i oppgave 2, 3 og 4 fra Avsnitt 1.1.3.
 */


public class Oppgave1141 {
    public static int maks(int[] a) {
        int o = 5 * (a.length + 1);
        int m = 0; // (1) tilordning
        ++o;
        int maksverdi = a[0]; // (1) tilordning
        ++o;

        for (int i = 1; i < a.length; i++) // (1) tilordning + (n) sammenligninger + (n-1) addisjoner
            if (a[i] > maksverdi) { // (n-1)utførelse av funksjon*(1 indeksering+1 indeksering+1 sammenligning)=3(n-1);
                maksverdi = a[i]; // (x) tilordning
                ++o;
                m = i; // (1) tilordning
            }
        System.out.println("Sum av alle operasjoner av tabell: " + o);
        return m; // (1) tilordning
    }

    // Totalt antall operasjoner:
    // Linje 16: 1
    // Linje 17: 1
    // Linje 19: 1+(n)+(n-1)=1-1+n+n=2n
    // Linje 20: 3(n-1)=3n-3
    // Linje 21: x
    // Linje 22: 1
    // Linje 24: 1
    // Sum: 1+1+2n+3n-3+x+1+1 = 5n+x+1

    public static void main(String[] args) {
        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] c = {1, 3, 2, 7, 5, 9, 6, 8, 10, 4};

        System.out.println("Indeks til største tall i tabellen er: " + maks(a));
        System.out.println("Indeks til største tall i tabellen er: " + maks(b));
        System.out.println("Indeks til største tall i tabellen er: " + maks(c));

    }

}
