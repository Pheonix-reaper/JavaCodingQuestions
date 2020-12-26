/**
 * 
    
A B C D D C B A
  A B C C B A
    A B B A
      A A

for n=4

 */
import java.util.*;
public class pattern33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for(int i=1;i<=n;i++)
        {   
             for(int j=1;j<=i-1;j++)
             System.out.print("  ");
            for(int j=0;j<=n-i;j++)
            System.out.print((char)(ch+j)+" ");
            for(int j=n-i;j>=0;j--)
            System.out.print((char)(ch+j)+" ");
            System.out.println();
        }
    }
}
