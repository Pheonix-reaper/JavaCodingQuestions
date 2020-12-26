/**
 * 
    
    
  * * * * * * * * * 
    *           *
      *       *
        *   *
          *

for n=5

 */
import java.util.*;


public class pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--)
        {
            for(int j=n-i+1;j>=1;j--)
            System.out.print("  ");
            for(int j=1;j<=2*i-1;j++)
            {
                if(i==n || j==1 || j==2*i-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
