import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int pos=0;
        for(int i=0;i<n-1;i++)
        {   pos=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[pos])
                {
                    pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }
        System.out.println("The Elements of array are:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        sc.close();
    }
}
