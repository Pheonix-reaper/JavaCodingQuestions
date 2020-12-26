import java.util.*;

/**  
   
 for n=5:

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1

**/
public class pattern24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            System.out.printf("%2d",j);
            System.out.println();
        }
    }
}
