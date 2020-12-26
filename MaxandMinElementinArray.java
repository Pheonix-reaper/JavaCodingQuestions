/**
 
Question Link: https://practice.geeksforgeeks.org/problems/maximum-and-minimum-of-array-elements/0/?category[]=Arrays&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]ArraysproblemTypefulldifficulty[]-2difficulty[]-1page1#


**/

import java.util.*;

class MaxandMinElementinArray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		int arr[]=new int[101];
		int max,min;
		while(t>0)
		{
		    t=t-1;
		    n=sc.nextInt();
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    max=arr[0];
		    min=arr[0];
		    for(int i=1;i<n;i++)
		    {
		        if(max<arr[i]){
		        max=arr[i];
		        continue;
		        }
		        if(min>arr[i])
		        {
		            min=arr[i];
		            continue;
		        }
		    }
		    System.out.println(max+" "+min);
        }
        sc.close();
	}
}