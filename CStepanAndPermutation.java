import java.util.*;
public class CStepanAndPermutation{
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

        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int g = gcd(x, y);

            boolean ok = true;

            for (int i = 1; i <= n; i++) {
                int val = sc.nextInt();

                if ((i % g) != (val % g)) {
                    ok = false;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}