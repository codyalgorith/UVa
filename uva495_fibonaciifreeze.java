/*in this problem i have used java because cpp cant store fib of large number like 5000
rest is simple */
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
		
		BigInteger[] fib = new BigInteger[5010];
		
		fib[0]=BigInteger.ZERO;
		fib[1]=BigInteger.ONE;
		
		for(int i =2;i<=5001;++i)
		{
			fib[i]= fib[i-1].add(fib[i-2]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		while(scn.hasNext())
		{
			int n= scn.nextInt();
			System.out.println("The Fibonacci number for "+ n +" is "+fib[n].toString());
		}
		
		
		
	}
}
