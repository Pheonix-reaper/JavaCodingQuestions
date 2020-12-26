//Question Link: https://practice.geeksforgeeks.org/problems/squares-in-a-matrix/0/?category[]=Matrix&problemStatus=unsolved&problemType=full&difficulty[]=-1&page=1&query=category[]MatrixproblemStatusunsolvedproblemTypefulldifficulty[]-1page1#

/* 

Question:
 Given a MxN matrix, count the number of squares in the matrix.squaresinREct

Input:

The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two space seperated integers M and N, denoting the size of the Matrix.
Output:

For each test output a single integer denoting the total number of squares.
Constraints:

1 <= T <= 102
1 <= M,N <= 104

Example:

Input:

2
2 2
4 3

Output:

5
20

*/


import java.util.*;
public class GFGNumberOfSquaresinAMatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int x=0,y=0;
            if(m<n)
            {
                x=m;
                y=n;
            }
            else
            {
                x=n;
                y=m;
            }
            long squares=0;
            for(int i=x;i>=1;i--)
            {
                squares=squares+i*y;
                y=y-1;
            }
            System.out.println(squares);
        }
        sc.close();
    }
}
