package ukeoppgaver34;

/*
Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
Hva må endres for at den skal returnere posisjonen til den siste?
 */

public class Oppgave1123 {
    public static int maks(int[] a) {
        int maks = a[0];
        int maksindex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] >= maks) {
                maks = a[i];
                maksindex = i;
            }
        }
        return maksindex;
    }
    public static void main(String[] args) {
        int [] a= {8,4,17,10,6,20,1,11,15,3,18,20,9,2,7,20,19};
        System.out.println("Indeksen til den største verdien i tabellen er: " + maks(a));
    }
}
