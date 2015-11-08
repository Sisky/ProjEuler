/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

package main;

public class Problem_7 
{

	public static void main(String[] args) 
	{
		int counter = 0;
		long num = 2;
		
		while(counter < 10001)
		{
			if(isPrime(num))
			{
				counter++;	
				if(counter == 10001)
				{
					System.out.println("Answer: " + num);
				}
			}
			num++;
		}				
	}
	
	public static boolean isPrime(long num)
	{
		if(num == 1 || num == 2)
		{
			return true;
		}
		if(num % 2 == 0)
		{
			return false;
		}
		for(long i = 3; i * i <= num; i += 2)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
