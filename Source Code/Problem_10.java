/**
 *The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 *Find the sum of all the primes below two million.
 */

package main;

public class Problem_10 
{

	public static void main(String[] args) 
	{
		long sum = 0;
		
		for(int i = 2; i < 2000000; i++)
		{
			if(isPrime(i))
			{
				sum += i;
			}
		}
		
		System.out.println("Answer: " + sum);

	}
	
	public static boolean isPrime(long num)
	{
		if(num == 2)
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
