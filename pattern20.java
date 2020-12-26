/**
 * 
    
    *
   * *
  *   *
 *     *
*********

for n=5

 */
import java.util.*;
public class pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for (int i=1; i<= n ; i++)
            {
                for (int j = i; j <=n-1 ; j++) {
                    System.out.print(" ");
                }   
                for (int k = 1; k <= (2*i -1) ;k++) {
                    if( k==1 || i == n || k==(2*i-1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
    }
}
