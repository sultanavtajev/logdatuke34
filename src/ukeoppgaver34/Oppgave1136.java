package ukeoppgaver34;

/*
Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
long fak(int n) som regner ut n!. Hvor mange multiplikasjoner utføres i metoden?
 */

public class Oppgave1136 {
    public static long [] fak(int n) {
        int multi= 0;
        for (int i = (n-1); i >= 1; --i) {
            n=n*i;
            multi++;
        }
        return new long[] {n, multi};
    }

    public static void main(String[] args) {
        int fTall = 10;
        long [] svar = fak(fTall);
        long fRes = svar[0];
        long fMulti = svar[1];
        System.out.println("Resultatet av fakultet " + fTall + " er: " + fRes);
        System.out.println("Antall multiplikasjoner er: " + fMulti);

    }
}
