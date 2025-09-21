import java.util.*;
public class A_Soldier_and_Bananas{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();  //cost of firsts banana
        int n=sc.nextInt();  //money 
        int w=sc.nextInt();  //buy w banana

        int totalCost=k*w*(w+1)/2;
        int borrow=totalCost-n;
        if(borrow<0){
            System.out.println(0);
        }
        else{
        System.out.println(borrow);
        }
    }
}