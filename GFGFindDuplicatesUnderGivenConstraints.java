
//Question Link: https://practice.geeksforgeeks.org/problems/find-duplicates-under-given-constraints/0/?category[]=Arrays&problemType=full&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]ArraysproblemTypefulldifficulty[]-2difficulty[]-1page1#

/* 
  Given a sorted array having 10 elements which contains 6 different numbers in which only 1 number is repeated five times. Your task is to find the duplicate number using two comparisons only.

Examples:

Input: A[] = {1, 1, 1, 1, 1, 5, 7, 10, 20, 30}
Output: 1

Input: A[] = {1, 2, 3, 3, 3, 3, 3, 5, 9, 10}
Output: 3


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow . Each test case contains 10 space separated values of the array A[].

Output:
For each test case in a new line print the required duplicate element.

Constraints:
1<=T<=100
1<=A[]<=10^5+5

Example:
Input:
2
1 2 4 5 6 9 9 9 9 9
1 2 3 3 3 3 3 5 9 10

Output:
9
3

*/

/*package whatever //do not write package name here */

import java.util.*;


public class GFGFindDuplicatesUnderGivenConstraints {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
int t=in.nextInt();
while(t>0){
int a[]=new int[10];
for(int i=0;i<a.length;i++){
    a[i]=in.nextInt(); }
    for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            System.out.println(a[i]);
            break;
            }
            } 
            t--;
    
}
  in.close();
	}
}