import java.util.*;
public class A_Cover_in_Water{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
    
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            if(str.contains("...")){
                System.out.println(2);
            }else{
                 int countDot=0;
            for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='.'){
                countDot++;
            }

           }
           System.out.println(countDot);
        }
    }
}
}