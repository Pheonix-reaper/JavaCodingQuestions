import java.util.Scanner;

/**
 * To Print the pattern based on user input: The pattern is something like: for
 * n=5:
 
*****
*****
*****
*****
*****

 * 
 **/
public class pattern1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}