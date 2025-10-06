import java.util.*;
public class B_Deck_of_Cards{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            int t=0,b=0,u = 0;
            if(n==1){
                System.out.println("-");
            }
            else{
            for(char ch:str.toCharArray()) {
                if(ch=='0') t++;
                else if(ch=='1') b++;
                else u++;
            }

            char []res=new char[n];
            Arrays.fill(res, '+'); 
            for(int i=0;i<t;i++) {
                res[i]='-';
            }

            for(int i=0;i<b;i++) {
                res[n-1-i]='-';
            }

            int topUncertain = Math.min(u, n-t-b); 
            for(int i=t;i<t+topUncertain && i<n;i++) {
                if (res[i]=='+') res[i]='?';
            }
              int bottomUncertain = u;
           for(int i=n-1;i>=0 && bottomUncertain>0;i--){
                if(res[i]=='+'){
                    res[i]='?';
                    bottomUncertain--;
                }
            }
            System.out.println(new String(res));
        }
        }
    }
}