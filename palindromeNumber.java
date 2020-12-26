import java.util.*;
public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nummber to be checked:");
        int n=sc.nextInt();
        sc.close();
        int temp=n;
        int rev=0,lastdigit;
        while(temp>0)
        {
            lastdigit=temp%10;
            rev=rev*10+lastdigit;
            temp=temp/10;
        }
        if(rev==n)
        System.out.println("It is a Palindrome number");
        else
        System.out.println("It is not a Palindrome number");
    }
}
