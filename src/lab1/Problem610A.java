package lab1;

import java.util.Scanner;

public class Problem610A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;

        if (n < 1 || n > 2 * Math.pow(10, 9)) {
            return;
        }

        if (n % 2 != 0) {
            System.out.println(res);
            return;
        }

        int half = n / 2;

        for (int i = 1; i < half; i++) {
            res++;
        }
        System.out.println(res / 2);
    }
}
