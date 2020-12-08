import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());
        int k= A.compareTo(B);
        if(k>0)  
        {
            System.out.println("Yes");
        }      
        else
        {
            System.out.println("No");
        }
        String s1 = Character.toString(A.charAt(0));
        s1=s1.toUpperCase();
        String s2 = Character.toString(B.charAt(0));
        s2=s2.toUpperCase();
        System.out.print(s1+A.substring(1)+" "+s2+B.substring(1));
    }
}



