import java.util.*;
/**
   To print the pattern:
   * * * * *
   * * * *
   * * *
   * *
   * 
   here n=5

 **/
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}