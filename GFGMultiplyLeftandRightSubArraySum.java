//This question is from Geek for geeks. Link: https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum/0/?category[]=Arrays&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]ArraysproblemTypefulldifficulty[]-2difficulty[]-1page1#
/**
 
Pitsy needs help in the given task by her teacher. The task is to divide a array into two sub array (left and right) containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.

Input:
First line consists of T test cases. Only line of every test case consists of an integer N.â€‹

Output:
Print the answer by dividing array into left and right array and add their elements individually and then multiply both the array

Constraints:
1<=T<=100
1<=N<=1000
1<=Ai<=100

Example:
Input:
2
4
1 2 3 4
3
4 5 6
Output:
21
44


 **/
import java.util.*;

public class GFGMultiplyLeftandRightSubArraySum {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,n;
		int left,right;
		int arr[]=new int[1001];
		t=sc.nextInt();
		while(t>0)
		{   left=0;
		    right=0;
		    t=t-1;
		    n=sc.nextInt();
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    for(int i=0;i<n/2;i++)
		    left=left+arr[i];
		    for(int i=n/2;i<n;i++)
		    right=right+arr[i];
		    int multiply=0;
		    multiply=left*right;
		    System.out.println(multiply);
        }
        sc.close();
	}
}