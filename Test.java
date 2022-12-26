import java.util.*;     //  digit sum //
import java.lang.*;

import javax.sound.sampled.SourceDataLine;
public class Test {
    public static void main(String[] args) {
        int n,b=1,c=0,d,x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=i;
            for(int j=1;j<=n;j++){
                a=a/10;
                if(a==0)
                {
                    if(j%2==1){
                        b=j*2;
                    }
                    if(j%4!=0){
                        b=j*3;
                    }
                    if(j%4==0){
                        b=j*4;
                    }
                }
                c=c+b;
                break;
            }
        }
        System.out.println(c);
        while(c!=0){
            d=c%10;
            x=x+d;
            c=c/10;
            if(c==0){
                if(x<9){
                    c=x;x=0;
                }
            }
        }
        System.out.println("x = "+x);
        

    }
    

    }
    

