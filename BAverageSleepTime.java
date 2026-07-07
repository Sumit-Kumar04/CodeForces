import java.util.Scanner;

public class BAverageSleepTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long windowSum = 0;

        
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        long total = windowSum;

        
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            total += windowSum;
        }

        double ans = (double) total / (n - k + 1);

        System.out.printf("%.10f\n", ans);
    }
}