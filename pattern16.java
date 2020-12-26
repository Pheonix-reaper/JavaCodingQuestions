import java.util.*;
/**
   To print the pattern:
       
            *
         *  *
        *   *
      *     *
    * * * * *

   
   here n=5

 **/
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++)
        {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
 
            // Loop for printing '*'
            for (int k = 1; k <= i; k++)
            {
                // Print '*' for boundaries
                if (i == n || k == 1 || k == i) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
 
            // Move to the next row
            System.out.print(System.lineSeparator());
        }
    }
}
