import java.util.Scanner;

public class DMashaAndABeautifulTree{
    static int ans=0;
    static void partition(int arr[],int st,int ei){
        int mid=arr.length/2;
        int max=partition(arr,st,mid);
        int min=partition(arr,mid+1,st);
        if(min<max){
            swap()
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            partition(arr,0,arr.length-1);
        }
    }
}