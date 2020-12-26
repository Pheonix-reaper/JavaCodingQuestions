/**
 * 
    
*
1 *
* 2 *
1 * 3 *
* 2 * 4 *

for n=5

 */
import java.util.*;
public class pattern32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for (int i=1;i<=n ; i++)
            {
               for(int j=1;j<=i;j++)
               {
                   if(i%2!=0)
                   {
                       if(j%2!=0)
                       System.out.print("* ");
                       else
                       System.out.print(j+" ");
                   }
                   else{
                       if(j%2!=0)
                       System.out.print(j+" ");
                       else 
                       System.out.print("* ");
                   }
               }
                System.out.println();
            }
    }
}
