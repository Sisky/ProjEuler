/**
 * Finds the sum of all multiples of 3 or 5 below 1000
 */

package main;

public class Problem_1 
{
	public static void main(String[] args) 
	{
		int totalSum = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				totalSum += i;
			}
		}
		System.out.println("Answer: " + totalSum);
	}
}
