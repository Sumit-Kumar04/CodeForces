import java.util.*;
public class AIskanderAndDrawings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            
            int maxTime=0;
            int currentLength=0;
            
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='#'){
                    currentLength++;
                }else{
                    if(currentLength>0){
                        maxTime=Math.max(maxTime,(currentLength+1)/2);
                        currentLength=0;
                    }
                }
            }
            
            if(currentLength>0){
                maxTime=Math.max(maxTime,(currentLength+1)/2);
            }
            
            System.out.println(maxTime);
        }
        
    }
}