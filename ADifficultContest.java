import java.util.*;
public class ADifficultContest{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){  
            String s=sc.next();
           StringBuilder tc=new StringBuilder();
           StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='T'){
                    tc.append(s.charAt(i));
                }
                else{
                    sb.append(s.charAt(i));
                }
            }

           System.out.println(tc.toString()+sb.toString());            
        }
    }
} 