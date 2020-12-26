import java.util.*;
/**
   To print the pattern:
       
        1
      2 0 2
    3 0 0 0 3
  4 0 0 0 0 0 4
5 0 0 0 0 0 0 0 5

   
   here n=5

 **/
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print("  ");
            System.out.print(i+" ");
            for(int j=1;j<=2*i-3;j++)
            System.out.print("0 ");
            if(i>1){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
