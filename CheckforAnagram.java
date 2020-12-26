import java.util.*;
public class CheckforAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String:");
        String a=sc.next();
        System.out.println("Enter the Second String:");
       String b=sc.next();
        sc.close();
        boolean isAnagram = true;
        
        //Method 1 
        /** 
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        for (char ch : a.toCharArray()) {
            int n = (int) ch;
            arr1[n]++;
        }
        for (char ch : b.toCharArray()) {
            int n = (int) ch;
            arr2[n]++;
        }
        for (int i = 0; i < 256; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram=false;
                break;
            }
        }
        if(isAnagram==false)
        {
            System.out.println("The Strings are not anagram");
        }
        else
        System.out.println("THe strings are anagram");
        **/




        //Method2

        /**int arr[] = new int[256];
        for (char ch : a.toCharArray()) {
            int n = (int) ch;
            arr[n]++;
        }
        for (char ch : b.toCharArray()) {
            int n = (int) ch;
            arr[n]--;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0) {
                isAnagram=false;
                break;
            }
        }
        if(isAnagram==false)
        {
            System.out.println("The Strings are not anagram");
        }
        else
        System.out.println("THe strings are anagram");
        **/



        //Method 3(sorting the String by using character array and then comparing the elements)



       /**  char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        int n=a.length();
       if(n!=b.length())
       {
        System.out.println("It is not an anagram");
        System.exit(1);
       }
        for(int i=0;i<n-1;i++)
        {
            int pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(ch1[pos]>ch1[j])
                pos=j;
            }
            char temp=ch1[pos];
            ch1[pos]=ch1[i];
            ch1[i]=temp;
        }
        for(int i=0;i<n-1;i++)
        {
            int pos=i;
            for(int j=i+1;j<n;j++)
            {
                if(ch2[pos]>ch2[j])
                pos=j;
            }
            char temp=ch2[pos];
            ch2[pos]=ch2[i];
            ch2[i]=temp;
        }
        for(int i=0;i<n;i++)
        {
            if(ch1[i]!=ch2[i])
            {
                isAnagram=false;
                break;
            }
        }
        if(isAnagram)
        {
            System.out.println("It is an Anagram");
        }
        else
        System.out.println("It is  not an anagram");
        **/
       
        //Method 4

        int la=a.length();
        int lb=b.length();
        if(la!=lb)
        {
            System.out.println("It is not an anagram");
            System.exit(1);
        }
        boolean visited[]=new boolean[la];
        for(int i=0;i<la;i++)
        {
            for(int j=0;j<la;j++)
            {   
                isAnagram=false;
                if(a.charAt(i)==b.charAt(i) && visited[j]==false)
                {
                    visited[j]=true;
                    isAnagram=true;
                    break;
                }
            }
            if(isAnagram==false)
             break;
            
             
        }
        if(isAnagram==false)
        System.out.println("It is not an Anagram");
        else        
        System.out.println("It is an Anagram");
    }
}
