/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package main;

public class Problem_4 
{
	static String toTest = "";
	static int highestProduct = 0; 
	
	public static void main(String[] args) 
	{
		for(int i = 100; i < 1000; i++)
		{
			for(int k = 100; k < 1000; k++)
			{
				toTest = String.valueOf(i * k);
				if(isPalindrome(toTest) && i * k > highestProduct)
				{
					highestProduct = Integer.parseInt(toTest);
				}
			}
		}
		System.out.println("Answer: " + highestProduct);
	}
	
	public static boolean isPalindrome(String string)
	{
		String reversed = new StringBuffer(string).reverse().toString();
		
		if(string.equals(reversed))
		{
			return true;
		}
		
		return false;
	}
}
