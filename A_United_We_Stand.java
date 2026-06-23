import java.util.*;

public class A_United_We_Stand {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long mx = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }

            ArrayList<Long> b = new ArrayList<>();
            ArrayList<Long> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (arr[i] < mx) {
                    b.add(arr[i]);
                } else {
                    c.add(arr[i]);
                }
            }

            if (b.size() > 0) {
                System.out.println(b.size() + " " + c.size());

                for (long x : b) {
                    System.out.print(x + " ");
                }
                System.out.println();

                for (long x : c) {
                    System.out.print(x + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}