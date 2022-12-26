import java.util.*;         // string white spacing //
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter a string");
        String a=sc.nextLine();
        char[]c=a.toCharArray();
        String b= "";
        for(int i=0;i < c.length;i++){
            if((c[i]!=' ')){
                b=b+c[i];
            }
        }
        System.out.println("before = " +a);
        System.out.println("after = " +b);
        sc.close();
        
    }
    
}
