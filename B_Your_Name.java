import java.util.*;
public class B_Your_Name{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String f=sc.next();
            HashMap<Character,Integer>map=new HashMap<>();
            for(char ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(char ch:f.toCharArray()){
                  map.put(ch,map.getOrDefault(ch,0)-1);
            }
            boolean flag=true;
            for(int val:map.values()){
                if(val!=0){
                    flag=false;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }

           
        }
    }
}