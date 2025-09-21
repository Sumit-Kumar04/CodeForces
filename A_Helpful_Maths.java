import java.util.*;
public class A_Helpful_Maths{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='+'){
                list.add(Integer.parseInt(Character.toString(ch)));
            }
        }
        Collections.sort(list);
        String ans="";
        for(int i=0;i<list.size();i++){
            ans+=list.get(i)+"";
            if(i!=list.size()-1){
                ans+="+";
            }
        }
        System.out.println(ans);

    }
}