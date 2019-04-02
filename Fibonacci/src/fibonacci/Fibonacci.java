
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner nin = new Scanner(System.in);
        System.out.print("Input : ");
        int count = nin.nextInt();
        
        int f1=1,f2=1,f3,i;
        
        System.out.println();
        System.out.println("Output : ");
        System.out.print(f1+" "+f2);   
        for(i=2;i<count;++i) {    
            f3=f1+f2;    
            System.out.print(" "+f3);    
            f1=f2;    
            f2=f3;
        }
        System.out.println();
    }
}
