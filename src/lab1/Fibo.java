package lab1;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 1 || n > 45) {
            return;
        }

        int[] tab = new int[n];

        tab[0] = 0;

        if (n >= 2) {
            tab[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }

        for (int element : tab) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }
}
