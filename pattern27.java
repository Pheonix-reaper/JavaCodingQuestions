import java.util.*;

/**  
   
 for n=5:

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5

**/
public class pattern27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            System.out.print(" ");
            for(int j=i;j<=n;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=i+2;j<=n;j++)
            System.out.print(" ");
            for(int j=n-i;j<=n;j++)
            System.out.print(j+" ");
            System.out.println();
        }
    }
}
