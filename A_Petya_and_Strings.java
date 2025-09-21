import java.util.Scanner;

public class A_Petya_and_Strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        int c1=0;
        int c2=0;
        int flag=0;
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            c1+=(int)ch1-'a';

            char ch2=s2.charAt(i);
            c2+=(int)ch2-'a';
             if(c1>c2){
            System.out.println("1");
            flag=1;
            break;
        }
        else if(c1<c2){
            System.out.println("-1");
            flag=1;
            break;
        }

        }
        if(flag==0){
        System.out.println("0");
        }
       
    }
}