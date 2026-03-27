import java.util.Scanner;
public class A_Line_Trip{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n+1];
            int maxdiff=0;
            int prev=0;
            int diff=0;
            for(int i=0;i<=n;i++){
                if(i==n){
                    arr[i]=x;
                }else{
                arr[i]=sc.nextInt();
                }
                 diff=arr[i]-prev;
                prev=arr[i];
                maxdiff=Math.max(maxdiff,diff);
            }
            maxdiff=Math.max(maxdiff,2*diff);
            System.out.println(maxdiff);
        }
    }
}