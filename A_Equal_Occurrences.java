import java.util.*;
public class A_Equal_Occurrences{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }

            HashMap<Integer,Integer> map=new HashMap<>();
            for(int val:nums){
                map.put(val,map.getOrDefault(val,0)+1);
            }
            int res=0;
            ArrayList<Integer> list=new ArrayList<>(map.values());
            Collections.sort(list,Collections.reverseOrder());
            int maxF=list.get(0);
            for(int i=1;i<=maxF;i++){
                int c=0;
                for(int val:list){
                    if(val>=i){
                        c++;
                    }
                }
                res=Math.max(res,i*c);
                
            }
            System.out.println(res);            
        }
    }
}