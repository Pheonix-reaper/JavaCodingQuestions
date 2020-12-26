//Question Lin: https://practice.geeksforgeeks.org/problems/max-value-after-m-range-operation/0/?category[]=Arrays&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]ArraysproblemTypefulldifficulty[]-2difficulty[]-1page1#
/*
Question:
Given an array of size N with all initial values as 0, write a program to perform following M range increment operations as shown below:
 

increment(a, b, k) : Increment values from 'a'
                     to 'b' by 'k'.  

After M operations, calculate the maximum value 
in the array.
Input:
First line of input contains a single integer T which denotes the number of test cases. T test cases follows. First line of each test case contains two space separated integers N and M. Next M lines of each test case contains three space separated integers a , b and k.

Output:
For each test case print the maximum element in the array after M increment operations.

Constraints:
1<=T<=100
1<=N<=105
1<=M<=1000
0<= a,b <= N-1

Example:
Input:
2
5 3
0 1 100
1 4 100
2 3 100
4 3
1 2 603
0 0 286
3 3 882
Output:
200
882

*/

/*package whatever //do not write package name here */

import java.util.*;
class GFGMaxValueAfterMrangeOperation {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n,m;
		int a,b,k;
		int max;
		int arr[]=new int[100000];
		while(t>0)
		{
		 max=0;
		 t=t-1;
		 n=sc.nextInt();
		 m=sc.nextInt();
		 for(int j=0;j<m;j++)
		 {
		 a=sc.nextInt();
		 b=sc.nextInt();
		 k=sc.nextInt();
		 for(int i=a;i<=b;i++)
		 {
		     arr[i]=arr[i]+k;
		 }
		 }
		 for(int i=0;i<n;i++)
		 {
		     if(max<arr[i])
		     max=arr[i];
		 }
		 System.out.println(max);
		 for(int i=0;i<n;i++)
		 arr[i]=0;
        }
        sc.close();
	}
}