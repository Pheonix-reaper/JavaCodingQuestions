import java.util.*;
/**
   To print the pattern:

*
* *
*   *
*     *
* * * * *

   
   here n=5

 **/
public class pattern9 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of N:");
    int n=sc.nextInt();
    sc.close();
    
    System.out.println("*");
    for(int i=2;i<=n-1;i++)
    {
        System.out.print("* ");
        for(int j=1;j<=i-2;j++)
        System.out.print("  ");
        System.out.print("* ");
        System.out.println();
    }
    if(n>1){
    for(int i=1;i<=n;i++)
    System.out.print("* ");
    }
    

    /**for(int i=1;i<=n-1;i++)
    {   
        System.out.print("*");
        for(int j=2;j<=i;j++)
        {
            if(j==i)
             System.out.print("*");
             else
             System.out.print(" ");
        }
        System.out.println();
    }
    if(n>1){
        for(int i=1;i<=n;i++)
        System.out.print("*");
        }
        **/

    }
}
