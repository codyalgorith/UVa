/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{   static BigInteger convtobig(String a,BigInteger fib[])
	{  BigInteger ans = BigInteger.ZERO;
		int n= a.length();
		for(int i=0;i<n;++i)
		{
			if(a.charAt(i)=='1')
			{
			ans=ans.add(fib[n-i-1]);
			}
		}
		
		return ans;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner scn= new Scanner(System.in);
		
		BigInteger[] fib = new BigInteger[110];
		fib[0]= BigInteger.ONE;
		fib[1] = BigInteger.valueOf(2);
		
		for(int i=2;i<=102;++i)
		{
			fib[i]=fib[i-1].add(fib[i-2]);  //storing the fib arrray beforehand
		}
		int first=0;
		while(scn.hasNext())
		{
			String a;
			a=scn.next();
		//	System.out.println(a);
			BigInteger ans= convtobig(a,fib);   //this func converts the string to biginteger using normal conversion rule in question
		//	System.out.println(ans.toString());
			a=scn.next();
			
			ans= ans.add(convtobig(a,fib));  
			
		//	System.out.println(ans.toString());
			
			int flag=0;
			if(first==1)System.out.println("");  //just for newline between two consecutive outputs
			first=1;
			for(int i=101;i>=0;--i)
			{  // System.out.println("comparing " + ans.toString() + " to "+ fib[i] );
				if(ans.compareTo(fib[i])>=0)   //although this method is slower (can be made faster??let me know :) )
				{
					System.out.print("1");   //if currently ans is greater than or equal to the fib value at index i we are good to go
					flag=1;
					ans=ans.subtract(fib[i]);//subtract (greedy)
			//	System.out.println("ans is now "+ ans.toString());
				}
				else if(flag==1)
				System.out.print("0");
			}
			
			if(flag==0)System.out.print("0");
			System.out.println("");
			
			
		}
		
	}
}
