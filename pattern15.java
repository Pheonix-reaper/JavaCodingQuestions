import java.util.*;
/**
   To print the pattern:
       
        0
      4 0 4
    3 4 0 4 3
  2 3 4 0 4 3 2
1 2 3 4 0 4 3 2 1

   
   here n=5

 **/
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        System.out.print("  ");
        System.out.println("0");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print("  ");
            for(int j=n-i+1;j<=n;j++)
            System.out.print(j+" ");
            System.out.print("0 ");
            for(int j=n;j>=n-i+1;j--)
            System.out.print(j+" ");
            System.out.println();
        }
    }
}
