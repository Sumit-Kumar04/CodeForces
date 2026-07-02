import java.util.*;
public class CSameDifferences{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();

            long res=0;
            for(int  i=0;i<n;i++){
                res+=map.getOrDefault(arr[i]-i,0);
                map.put(arr[i]-i,map.getOrDefault(arr[i]-i,0)+1);
            }
          
            System.out.println(res);

        }
    }
}