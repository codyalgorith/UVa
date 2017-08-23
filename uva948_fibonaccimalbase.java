/* package whatever; // don't place package name! */
/*just simple greedy algorithm involving fibonacii numbers ,see the biggest fib no that is smaller or equal to the our number 
repeat until our number reduces to zero or all the numbrs have been seen
iur number will always be representable in the form of addition of fib numbers acc to zeckendorf algorithm*/
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
		
		BigInteger[] fib = new BigInteger[110];
		fib[0]= BigInteger.ONE;
		fib[1] = BigInteger.valueOf(2);
		
		for(int i=2;i<=51;++i)
		{
			fib[i]=fib[i-1].add(fib[i-2]);
		}
		int first=0;
	
		int n= scn.nextInt();
	//	System.out.println(fib[50].toString());
		for(int g=0;g<n;++g)
		{
			BigInteger b = scn.nextBigInteger();
			
			System.out.print(b.toString()+" = ");
			int flag=0;
			for(int i=50;i>=0;--i)
			{
				
				if(b.compareTo(fib[i])>=0)
				{
					flag=1;
					System.out.print("1");
					b=b.subtract(fib[i]);
				}
				else if(flag==1)
				{
					System.out.print("0");
				}
			}
			
			if(flag==0)System.out.print("0");
			
			System.out.println(" (fib)");
			
		}
		
	}
}
