import java.util.*;
public class A_XORwice{
   
    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int res=a^b;
          
            System.out.println(res);
        }
    }
}