import java.util.*;

/**  
   
 for n=5:

A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F

**/
public class pattern29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=i;j++)
            System.out.print((char)(ch+i)+" ");
            System.out.println();
        }
        
    }
}
