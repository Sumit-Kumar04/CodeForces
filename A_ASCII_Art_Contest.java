import java.util.*;
public class A_ASCII_Art_Contest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            int arr[]=new int[3];
           for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
           }
           Arrays.sort(arr);
           if(arr[arr.length-1]-arr[0]>=10){
            System.out.println("check again");
           }else{
            System.out.println("final "+arr[1]);
           }


        
          
    }
}