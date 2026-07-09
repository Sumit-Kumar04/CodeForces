import java.util.*;

public class CPride {

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        int ones = 0;
        int all = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] == 1)
                ones++;

            if (i == 0)
                all = a[i];
            else
                all = gcd(all, a[i]);
        }

        if (ones > 0) {
            System.out.println(n - ones);
            return;
        }

        if (all != 1) {
            System.out.println(-1);
            return;
        }

        int best = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int g = a[i];

            for (int j = i; j < n; j++) {

                g = gcd(g, a[j]);

                if (g == 1) {
                    best = Math.min(best, j - i + 1);
                    break;
                }
            }
        }

        System.out.println(n + best - 2);
    }
}