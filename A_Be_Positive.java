import java.util.*;
public class A_Be_Positive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=0;
            int z=0;
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
                if(nums[i]==0){
                    z++;
                }
                else if(nums[i]==-1){
                    m++;
                }
            }
            int res=0;
            if(m%2!=0){
                res+=m%2+1;
            }
            res+=z;
            System.out.println(res);
        }
    }
}