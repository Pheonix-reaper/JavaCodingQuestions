//Question Link: https://practice.geeksforgeeks.org/problems/repeated-ids/0/?category[]=Arrays&problemStatus=unsolved&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]ArraysproblemStatusunsolvedproblemTypefulldifficulty[]-2difficulty[]-1page1
//Question:
/*
Raghav is given a task to select at most 10 employees for a company project. Each employee is  represented by a single digit I.D. number which is unique for all the selected employees of the project. Raghav has a technical problem in his system which printed I.D. number multiple times. Help him to get rid of the repeated numbers.
Input:
First line contain T test cases. Second line contain the Total number (N) of employees where repeated I.Ds. are present. Third line contain the array A[N] of size N containing the I.Ds. of employees.
Output:
Print the non repeated selected I.D. of employees in a new line in the same sequence they appear in Input.
Constraints:
1<=T<=100
0<=N<=1000
Example:
Input:
5
5
8 8 6 2 1
6
7 6 7 4 2 7
9
1 9 6 7 4 8 1 4 5
3
1 1 1
5
0 1 0 1 2
Output:
8 6 2 1
7 6 4 2
1 9 6 7 4 8 5
1
0 1 2
*/

//Solution

/*package whatever //do not write package name here */

import java.util.*;


class GFGRepeatedIDSQuestion {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int unique[]=new int[n];
		    int index=0;
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    unique[index]=arr[0];
		    index=index+1;
		    for(int i=1;i<n;i++)
		    {
		        for(int j=0;j<index;j++)
		        {
		            if(arr[i]==unique[j])
		            break;
		            if(j==index-1)
		            {
		                unique[index]=arr[i];
		                index=index+1;
		            }
		        }
		    }
		    for(int i=0;i<index;i++)
		    System.out.print(unique[i]+" ");
		    System.out.println();
        }
        sc.close();
	}
}