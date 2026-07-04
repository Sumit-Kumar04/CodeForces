import java.util.*;
public class BGoodTimesGoodTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int x=sc.nextInt();
           int l=String.valueOf(x).length();
           int y=1;
           for(int i=0;i<l;i++){
            y*=10;
           }
           y++;
           System.out.println(y);
        }
    }
}