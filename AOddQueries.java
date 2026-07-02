import java.util.*;
public class AOddQueries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int arr[]=new int[n];
            int prefixArr[]=new int[n];
           
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
            }
             prefixArr[0]=arr[0];
            for(int i=1;i<n;i++){
                prefixArr[i]=prefixArr[i-1]+arr[i];
            }

            for(int i=0;i<q;i++){
                int l=sc.nextInt();
                int r=sc.nextInt();
                int k=sc.nextInt();

                l--;
                r--;
                long lsum=0;
                if(l>0){
                    lsum=prefixArr[l-1];
                }
               
                long rSum=prefixArr[n-1]-prefixArr[r];
                long sum=lsum+rSum+k*(r-l+1);

                if(sum%2!=0){

                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }

        }
    }
}