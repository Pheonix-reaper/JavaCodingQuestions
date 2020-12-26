import java.util.*;

/**
 
for n=5:

    * 
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *


**/
public class pattern22 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of N:");
    int n=sc.nextInt();
    sc.close();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        System.out.print("  ");
        for(int j=1;j<=2*i-1;j++)
        {
            if(j==1 || j==2*i-1)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--)
    {
        for(int j=1;j<=n-i;j++)
        System.out.print("  ");
    for(int j=1;j<=2*i-1;j++)
        {
            if(j==1 || j==2*i-1)
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
    }
   } 
}
