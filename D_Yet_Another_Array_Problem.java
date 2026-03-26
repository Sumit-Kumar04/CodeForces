import  java.util.*;
public class D_Yet_Another_Array_Problem{
      public static long gcd(long a,long b){
        while(b!=0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
    long g=a[0];
        for(int i=1;i<n;i++){
            g=gcd(g,a[i]);
        }
        long ans=-1;
        for(long x=2;x<Long.MAX_VALUE;x++){
            if(gcd(g,x)==1){
            ans=x;break;
            }
        }
        System.out.println(ans);
        }
    }
}