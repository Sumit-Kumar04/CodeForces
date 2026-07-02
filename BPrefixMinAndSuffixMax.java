import java.util.Scanner;

public class BPrefixMinAndSuffixMax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int res[]=new int[n];

            int prefixMin=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]<=prefixMin){
                    res[i]='1';
                    prefixMin=arr[i];
                }
                
                
            }

            int suffixMax=arr[n-1];
            for(int i=n-1;i>=0;i--){
                if(arr[i]>=suffixMax){
                    res[i]='1';
                    suffixMax=arr[i];
                }
            }

            for(int i=0;i<n;i++){
                if(res[i]=='1'){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}