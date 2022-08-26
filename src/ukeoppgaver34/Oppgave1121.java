package ukeoppgaver34;

/*
1. Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en
tabell. Hva ville metodekallet min(a) returnere med hvis a er tabellen i Figur 1.1.2?
2. Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer)
posisjonen til den minste verdien i en tabell.
 */

public class Oppgave1121 {
    public static int min(int[] a) {
        int minst = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < minst) {
                minst = a[i];
            }
        }
        return minst;
    }
    public static void main(String[] args) {
        int [] a= {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        System.out.println("Den minste verdien i tabellen er: " + min(a));
    }
}
