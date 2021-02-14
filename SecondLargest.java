/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc  = new Scanner(System.in);
	    int t = sc.nextInt();
	    for (int i=1 ;i<=t ;i++ ){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        if((a>b && a<c) || (a>c && a<b))
	        {
	            System.out.println(a);
	        }else if((b>a && b<c) || (b>c && b<a))
	        {
	            System.out.println(b);
	        }else
	        {
	            System.out.println(c);
	        }
	    } 
		// your code goes here
	}
}
