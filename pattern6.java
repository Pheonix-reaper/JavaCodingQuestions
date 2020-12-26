import java.util.*;
/**
   To print the pattern:


      *   
    *   *
  *   *   *
*   *   *   *

   
   here n=4

 **/
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print("  ");
            for(int k=1;k<=i;k++)
            System.out.print("*   ");
            System.out.println();
        }
    }
}
