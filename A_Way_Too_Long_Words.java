import java.util.Scanner;
public class A_Way_Too_Long_Words{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
       
        while(i>0){
             String str=sc.next();
        if(str.length()<=10){
            System.out.println(str);
        }
        else{
            String s1=str.charAt(0)+"";
            String s3=str.charAt(str.length()-1)+"";
            String s2=(str.length()-2)+"";

            System.out.println(s1+s2+s3);
        }
        i--;
    }
    }
    
}
