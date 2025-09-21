import java.util.*;
 public class A_Bear_and_Big_Brother{
    public static  int weight(int a,int b,int c){
        if(a>b){
            return c;
        }
        c++;
        return weight(a*3,b*2,c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=weight(a,b,0);
        System.out.println(ans);
    }
 }    