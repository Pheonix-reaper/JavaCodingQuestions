import java.util.*;
public class Question4 {
   public static void main(String args[])
   {
       
       Scanner sc=new Scanner(System.in);
       String str,noblank="";
       String reverse="";
       System.out.println("Enter the String:");
       str=sc.nextLine();
       str.trim();
       str=str+" ";
       String[] strarr=str.split(" ");
       sc.close();
       System.out.println("First Word: "+strarr[0]+" Second Word: "+strarr[1]);
       for(int i=0;i<strarr.length;i++)
       noblank=noblank+strarr[i];
       System.out.println("String without any blanks: "+noblank);
       System.out.println("Last letter of first word: "+strarr[0].charAt(strarr[0].length()-1));
       System.out.println("First Letter of last Word: "+strarr[strarr.length-1].charAt(0));
       System.out.println("The first letter of every word is:");
       for(int i=0;i<strarr.length;i++)
       {
           System.out.println("First Letter of word "+(i+1)+" is:"+strarr[i].charAt(0));
       }
       for(int i=strarr.length-1;i>=00;i--)
       reverse=reverse+strarr[i]+" ";
       System.out.println("Word wise reverse of the string is: "+reverse);
   } 
}
