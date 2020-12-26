/*package whatever //do not write package name here */

import java.util.*;


class rotateArray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of Array:");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
        System.out.println("The array before rotation:");
		for(int i=0;i<=n-1;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        int temp=arr[0];
		for(int j=1;j<n;j++)
		{
		    arr[j-1]=arr[j];
		}
		arr[n-1]=temp;
		System.out.println("The array after rotation:");
		for(int i=0;i<=n-1;i++)
		System.out.print(arr[i]+" ");
		 System.out.println();
		sc.close();
		}
	}