package test;

import java.util.ArrayList;
import java.util.List;

public class Kombinasjon {
    static int fact(int number) {
        int f = 1;
        int j = 1;
        while(j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int n = numbers.size();
        int r = 3;
        int result;

        result = fact(n) / fact(n-r);
        System.out.println("Antall permutasjoner for " + numbers.toArray().length + " tall er: " + result);
    }
}
