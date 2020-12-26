import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to be reversed:");
        String s=sc.next();
        sc.close();
        System.out.println("The Original String is "+s);
        
        
        int n=s.length();
        String rev="";

        /** 
        //Method1(by using char array)
        String ch[]=s.split(""); //can also use <stringname>.toCharArray(),it will result in a char array instead of astring array
        for(int i=0;i<n;i++)
        System.out.print(ch[i]+" ");
        System.out.println();
        for(int i=n-1;i>=0;i--)
        rev=rev+ch[i];
        System.out.println("The reverse of the string: "+rev);
        **/
      
        //Method2(by using charAt()  function)
        n=n-1;
        while(n>=0)
        {   
            rev=rev+s.charAt(n);
            n=n-1;
            
        }
        System.out.println("The reverse of the string: "+rev);
    }
}
