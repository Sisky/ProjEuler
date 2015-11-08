/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
package main;

public class Problem_6 
{
	public static void main(String[] args)
	{
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for(int i = 1; i < 101; i++)
		{
			sumOfSquares += Math.pow(i, 2);
		}
		for(int k = 1; k < 101; k++)
		{
			squareOfSum += k;
		}
		squareOfSum = (int) Math.pow(squareOfSum, 2);
		
		System.out.println("Answer: " + (squareOfSum - sumOfSquares));
	}

}
