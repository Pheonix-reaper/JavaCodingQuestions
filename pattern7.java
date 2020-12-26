import java.util.*;
/**
   To print the pattern:


      1   
    2   3
  4   5   6
7   8   9   10

   
   here n=4

 **/
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        int c=1;
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print("  ");
            for(int k=1;k<=i;k++)
            System.out.print(c++ +"   ");
            System.out.println();
        }
    }
}
