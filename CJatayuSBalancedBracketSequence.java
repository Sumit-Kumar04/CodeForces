import java.util.Scanner;

public class  CJatayuSBalancedBracketSequence {
    public static void main(String[] args) {
        // Your code logic here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int comp=n;
            for(int i=0;i<2*n-1;i++){
                if(s.charAt(i)==')' && s.charAt(i+1)=='('){
                    comp--;
                    
                }
                
            }
            System.out.println(comp);

            


           
        }
    }
}