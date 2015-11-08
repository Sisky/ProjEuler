/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package main;

public class Problem_3 
{
	public static void main(String[] args) 
	{
		long num = 600851475143L;
		long i = 2;
		
		while (i < num)
		{
			if (num % i == 0)
			{
				num = num / i;
				if (isPrime(num)) 
				{
					System.out.println(num);
				}
			}
			else
			{
				i++;
			}
		}
	}
	
	/**
	 * Returns a boolean whether a number given is a prime number.
	 * 
	 * @param num 	The number to do a prime test on
	 * @return 		Boolean whether the number given is prime
	 */
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
