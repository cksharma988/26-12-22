import java.util.*;//           movie ticket program
public class Test3 {
    public void ticket(){
            int a,b=0,age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of person");
         a=sc.nextInt();
            for(int i=1;i<=a;i++){
                System.out.println("enter age of no. "+i+" person:- " );
                age=sc.nextInt();
            if(3<=age & age<=12)
            {
                b=b+100;
            }
            if(age>12)
            {
                b=b+150;
            }
         }
         System.out.println("total amount of tickets = "+b);
         
    }
      public static void main(String[] args) {
          Test3 obj=new Test3();
          obj.ticket();
      }
}