import java.util.*;

/**  
   
 for n=5:

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

**/

public class pattern23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
