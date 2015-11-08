/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

package main;

public class Problem_5 
{
	public static void main(String[] args) 
	{
		int i = 40;
		boolean found = false;
		
		while(!found)
		{
			for(int k = 11; k < 21; k++)
			{
				if(i % k != 0)
				{
					found = false;
					break;
				}
				else
				{
					found = true;
				}	
			}
			i++;
		}
		System.out.println("Answer: " + (i - 1));		
	}

}
