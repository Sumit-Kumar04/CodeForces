import java.util.Scanner;
import java.util.Stack;

public class EBlockSequence {
    public static void main(String[] args) {
        // Your code logic here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Integer> st = new Stack<>();
            int components = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    st.push(1);
                    components++;
                } else {
                    st.pop();
                    if (!st.isEmpty()) {
                        components--;
                    }
                }
            }

            System.out.println(components);
        }
    }
}