import java.util.*;
public class A_Beautiful_Matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=-1;
        int col=-1;
        int [][]matrix=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==1){
                    row=i+1;
                    col=j+1;
                    
                }
            }
        }
       
        int ans=Math.abs(row-3)+Math.abs(col-3);
        System.out.println(ans);
    }
}