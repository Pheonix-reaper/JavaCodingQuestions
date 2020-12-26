/**
 * SumOfDigits
 */
import java.util.*;
public class SumOfDigits {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        sc.close();
        int temp=n,lastdigit=0,sum=0;
        while(temp>0)
        {
            lastdigit=temp%10;
            temp=temp/10;
            sum=sum+lastdigit;
        }
        System.out.println("The Sum of numbers for "+n+" is "+sum);
//Trick to find the total amount of digits present in a number by using a simple formula
//The Formula is :  log10(n)+1

int numberOfDigits= (int)Math.log10(n)+1;
System.out.println("Number of Digits: "+numberOfDigits);

}
    
}