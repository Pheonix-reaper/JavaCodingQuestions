import java.util.*;
/**
   To print the pattern:
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * *
   
   here n=5

 **/
public class pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close(); 
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(" ");
            for(int j=1;j<=n-i+1;j++)
            System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=n-i+1;j++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
