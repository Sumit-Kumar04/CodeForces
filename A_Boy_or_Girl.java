import java.util.*;
 public class A_Boy_or_Girl{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            set.add(ch);
        }
        int setLength=set.size();
        if(setLength%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
 }    