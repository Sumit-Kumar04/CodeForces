import 
java.util.*;
public class BPartyMonster{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
           String s=sc.next();
           int o=0;
           int c=0;

           for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                o++;
            }
            else{
                c++;
            }
           }

           if(Math.abs(o-c)==0){
            System.out.println("YES");
           }
           else{
            System.out.println("NO");
           }

        }
        }
    }
