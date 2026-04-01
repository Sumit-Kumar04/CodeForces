import java.util.*;
public class A_Don_t_Try_to_Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            StringBuilder sb=new StringBuilder(x);
            int counter=0;
            boolean flag=false;
           while(sb.length()<=s.length()){
                if(sb.indexOf(s)!=-1){
                    System.out.println(counter);
                     flag=true;
                    break;
                   
                }
                 sb.append(sb.toString());
                 counter++;
                
           }

           if(flag==false){
             if(sb.indexOf(s)!=-1){
            System.out.println(counter);
           
            }else{
            counter ++;
            sb.append(sb.toString());
           

           if(sb.indexOf(s)!=-1){
            System.out.println(counter);
           }else{
            System.out.println(-1);
           }
        }
        }
        }
    }
     
}