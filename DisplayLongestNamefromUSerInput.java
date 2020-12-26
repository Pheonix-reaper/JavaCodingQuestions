/**Given a list of names, display the longest name.

Input:
First line of input contains an integer T, the number of test cases. For each test case, there will be two lines. First line contains integer N i.e. total number of names, and second line contains N space seperated names of different length.

Output:
Longest name in the list of names.

Constraints:
1 <= T <= 10
1 <= N <= 10
1 <= |length of name| <= 1000

Example:
Input:
1
5
Geek
Geeks
Geeksfor
GeeksforGeek
GeeksforGeeks

Output:
GeeksforGeeks
**/
/*package whatever //do not write package name here */

import java.util.*;
public class DisplayLongestNamefromUSerInput {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n,max=0,pos=0;
		String []S=new String[1001];
		while(t>0)
		{
		    t=t-1;
		    n=sc.nextInt();
		    max=0;
		    pos=0;
            for(int i=0;i<n;i++)
            S[i]=sc.next();
            for(int i=0;i<n;i++)
            {
                if(max<S[i].length())
                {
                    max=S[i].length();
                    pos=i;
                }
            }
            System.out.println(S[pos]);
        }
        sc.close();
	}
}