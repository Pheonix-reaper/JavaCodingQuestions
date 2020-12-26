import java.util.*;

/**  
   
 for n=6:

A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F

**/
public class pattern30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-i-1;j++)
            System.out.print((char)(ch+j)+" ");
            System.out.println();
        }

        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=i;j++)
            System.out.print((char)(ch+j)+" ");
            System.out.println();
        }
    }
}
