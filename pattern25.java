import java.util.*;

/**  
   
 for n=5:

10101
01010
10101
01010
10101

**/
public class pattern25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
             if(i%2==0)
             {
                 if(j%2==0)
                 System.out.print("1");
                 else
                 System.out.print("0");
             }
             else{
                if(j%2!=0)
                System.out.print("1");
                else
                System.out.print("0");
             }
           }
            System.out.println();
        }
    }
}
