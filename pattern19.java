import java.util.*;
/**
   To print the pattern:
  
** 
* *
***
* *
* *
* *
   
   here n=5

 **/
public class pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close(); 
        // Outer for loop for number of lines
    for (int i = 0; i<=n; i++) {
        // Inner for loop for logic execution
        for (int j = 0; j<= n / 2; j++) {
        // prints two column lines
        if ((j == 0 || j == n / 2) && i != 0 ||
        // print first line of alphabet
        i == 0  && j != n / 2 ||
        // prints middle line
        i == n / 2)
        System.out.print("*");
        else
        System.out.print(" ");
        }
        System.out.println();
    }
    }
}
