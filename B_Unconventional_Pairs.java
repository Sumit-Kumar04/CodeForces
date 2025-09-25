import java.util.*;

public class B_Unconventional_Pairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            Arrays.sort(nums);
            int i=0;
            int j=i+1;
            int max=Integer.MIN_VALUE;
            while(i<n && j<n){
                
                int dif=Math.abs(nums[i]-nums[j]);
                max=Math.max(dif,max);
                i=j+1;
                j=i+1;



            }
            System.out.println(max);
        }
    }
}