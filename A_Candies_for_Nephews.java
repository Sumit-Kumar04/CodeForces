import java.util.*;
public class A_Candies_for_Nephews{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%3==0){
                System.out.println(0);
            }
            else{
            boolean flag=true;
            int res=0;
            while(flag){
                n++;
                res++;
                if(n%3==0){
                    flag=false;
                    System.out.println(res);
                }
            }
        }
        }
    }
}