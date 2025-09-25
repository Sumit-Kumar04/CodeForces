import java.util.*;

public class C_MEX_rose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int c = 0;
            HashSet<Integer> set = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
                if (arr[i] == k) {
                    c++;
                }
            }
            
            if (c > 0) {
                System.out.println(c);
            } else {
                boolean missing = false;
                for (int i = 0; i < k; i++) {
                    if (!set.contains(i)) {
                        missing = true;
                        break;
                    }
                }
                if (missing) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
       
    }
}
