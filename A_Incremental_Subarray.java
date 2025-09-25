import java.util.*;
public class A_Incremental_Subarray{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t-- >0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int []a=new int[m];
            for(int i=0;i<m;i++){ 
                a[i] = sc.nextInt();
            }
            boolean consecutive=true;
            for(int i=0;i<m-1;i++) {
                if(a[i+1]!=a[i]+1) {
                    consecutive=false;
                    break;
                }
            }

            if(consecutive) {
                System.out.println(n-a[m-1]+1);
            } else {
                System.out.println(1);
            }
        }
    }    
}
  