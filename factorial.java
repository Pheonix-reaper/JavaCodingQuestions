import java.util.Scanner;


/**
 * factorial
 */
public class factorial {

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int fact=sc.nextInt();
        n=fact;
        for(int i=fact-1;i>=2;i--)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+ n +" is: "+fact);
        sc.close();

    }
}