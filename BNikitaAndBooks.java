import java.util.*;
public class BNikitaAndBooks{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            
            long sum=0;
            long prev=0;
            boolean possible=true;
            
            for(int i=0;i<n;i++){
                sum+=arr[i];
                
                long needed=prev+1;
                
                if(sum<needed){
                    possible=false;
                    break;
                }
                
                prev=needed;
                sum-=needed;
            }
            
            if(possible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}