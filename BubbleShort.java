/**
 * BubbleShort
 */
import java.util.*;
public class BubbleShort {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of Array:");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    for(int i=0;i<n-1;i++)
    {   boolean sorted=true;
        for(int j=0;j<n-1-i;j++)
        {
            if(arr[j+1]<arr[j])
            {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                sorted=false;
            }
        }
        if(sorted)
        break;
    }
    System.out.println("The Elements of array are:");
    for(int i=0;i<n;i++)
    System.out.print(arr[i]+" ");
    sc.close();
}
    
}