import java.util.*;
/**
   To print the pattern:
   * * * *
     * * *
       * *
        *
   
   here n=4

 **/
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        //This is a way to solve it
        /**for(int i=n;i>=1;i--)
        {
            for(int z=0;z<n-i;z++)
             System.out.print("  ");
            for(int j=1;j<=i;j++)
             System.out.print("* ");
            System.out.println();
        }**/
        //Another way to solve it
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
             System.out.print("  ");
            for(int j=1;j<=n-i+1;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
