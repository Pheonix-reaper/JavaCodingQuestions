//GFG Question Link:https://practice.geeksforgeeks.org/problems/multiply-array/0/?category[]=Arrays&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]ArraysproblemTypefulldifficulty[]-2difficulty[]-1page1
//Question:
/* Calculate the product of all the elements in an array.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines . The first line of each test case contains an integer N.The second line of each test case contains N space separated integers denoting elements of the array A[ ].

Output:
For each test case in a new line print the product of all elements.

Constraints:
1  ≤ T  ≤  50
1  ≤  N  ≤  10
1  ≤  A[i]  ≤  5

Example:
Input:
2
5
1 2 3 4 5
10
5 5 5 5 5 5 5 5 5 5

Output:
120
9765625 */



import java.util.*;
class MultiplyArrayElements {
	public static void main (String[] args) {
		int t,n;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		int mult;
		while(t>0)
		{
		    t=t-1;
		    mult=1;
		    n=sc.nextInt();
		    for(int i=0;i<n;i++)
	        {
		    arr[i]=sc.nextInt();
		    mult=mult*arr[i];
	        }
	        System.out.println(mult);
        }
        sc.close();
	}
}