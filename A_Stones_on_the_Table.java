import java.util.*;
 public class A_Stones_on_the_Table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int res=0;
        String str=sc.next();
        char c1=str.charAt(0);
        for(int i=1;i<n;i++){
            char c2=str.charAt(i);
            if(c1==c2){
                res++;
            }
            else{
                c1=c2;
            }
        }
        System.out.println(res);
    }
 }    