package ukeoppgaver34;

//Min metode som henter posisijonen til den laveste verdien i et array og skriver denne ut til console

public class Oppgave1121 {
    public static int min(int[] a) {
        int minst = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minst]) {
                minst = a[i];
            }
        }
        return minst;
    }
    public static void main(String[] args) {
        int [] a= {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        System.out.println(min(a));
    }
}
