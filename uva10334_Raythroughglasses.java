/* we can notice that pattern recognizes fibonacci numbers */
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{   
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner scn= new Scanner(System.in);
		
		BigInteger[] fib = new BigInteger[1010];
		fib[0]= BigInteger.ONE;
		fib[1] = BigInteger.valueOf(2);
		
		for(int i=2;i<=1001;++i)
		{
			fib[i]=fib[i-1].add(fib[i-2]);
		}
		int first=0;
	
		//int n= scn.nextInt();
	//	System.out.println(fib[50].toString());
		while(scn.hasNext())
		{
			int n= scn.nextInt();
			
			System.out.println(fib[n]);
		}
		
	}
}
