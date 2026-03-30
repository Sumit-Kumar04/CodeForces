import java.util.*;
public class A_Doremy_s_Paint_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
          
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
               
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
              
            }

            if(map.size()>=3){
                System.out.println("No");
            }else{
                int f1=0;
                int f2=0;
                ArrayList<Integer> list=new ArrayList<>(map.values());
               f1=list.get(0);
               f2=list.get(list.size()-1);
                if(n%2==0 && f1==f2){
                    System.out.println("Yes");
                }else if(n%2!=0 && Math.abs(f1-f2)<=1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                
            }
            
            

        }
    }
}