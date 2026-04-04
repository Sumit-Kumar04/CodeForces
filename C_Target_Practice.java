
import java.util.*;
public class C_Target_Practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char arr[][]=new char[10][10];
            int n=arr.length;
            int m=arr[0].length;
            int res=0;
            for(int i=0;i<n;i++){
                String str=sc.next();
                for(int j=0;j<m;j++){
                    arr[i][j]=str.charAt(j);
                    if(arr[i][j]!='.'){
                    //1
                    if(i==0 || j==0 || i==n-1 || j==n-1){
                        res+=1;
                    }else if(i==1 || j==1 || i==n-2 || j==n-2){
                        res+=2;
                    }else if(i==2 || j==2 || i==n-3 || j==n-3){
                        res+=3;
                    }else if(i==3 || j==3 || i==n-4 || j==n-4){
                        res+=4;
                    }else{
                        res+=5;
                    }
                }
                    
                }
            }
            System.out.println(res);
        }
        
       
    }
}