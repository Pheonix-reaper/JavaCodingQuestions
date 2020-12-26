import java.util.*;
public class series1 {

    public static void main(String args[]) {
        System.out.println("Enter the range:");
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        float sum=0.0F;
        for(float i=1;i<=n;i+=2)
        {
            sum=sum+(1/i);
        }
        for(float i=2;i<=n;i+=2)
        {
            sum=sum-(1/i);
        }
        System.out.println("Sum of series: "+sum);
        sc.close();
    }
}
