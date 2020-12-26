/**
 * 
    
1

2 6

3 7 10 

4 8 11 13

5 9 12 14 15

for n=5

 */
import java.util.*;
public class pattern31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for (int i=1;i<= n ; i++)
            {
                int k=n-1;
                int l=n-1+i;
                for(int j=1;j<=i;j++)
                {
                    if(j==1)
                    System.out.print(i+" ");
                    else{
                    System.out.print(l+" ");
                    k=k-1;
                    l=k+l;
                    }
                   
                }
                System.out.println();
            }
    }
}
