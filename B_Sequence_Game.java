import java.util.*;

public class B_Sequence_Game {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            List<Integer> a = new ArrayList<>();
            a.add(b[0]);

            for (int i = 1; i < n; i++) {
                if (b[i-1] > b[i]) {
                    a.add(b[i]);
                }
                a.add(b[i]);
            }

            System.out.println(a.size());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a.size(); i++) {
                sb.append(a.get(i));
                if (i < a.size() - 1) sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}