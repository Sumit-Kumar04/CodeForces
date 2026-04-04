import java.util.*;
public class A_Ambitious_Kid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=Integer.MAX_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            res=Math.min(Math.abs(arr[i]-0),res);
        }

        System.out.println(res);
        
    }
   
}