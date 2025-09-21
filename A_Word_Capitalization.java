import java.util.*;
 public class A_Word_Capitalization{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch=str.charAt(0);
        ch=Character.toUpperCase(ch);
        str=ch+str.substring(1);
        System.out.print(str);
    }
 }    