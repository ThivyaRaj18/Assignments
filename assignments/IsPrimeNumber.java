package week1.day2.assignments;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// Variable declaration
		int i, num, flag = 0; 

		//Prompts input from user and stored
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter any number : ");
		num= sc.nextInt();		

		//Condition to check the number get divided 
		for (i = 2; i <= num/2; i++)
		{
			if(num % i == 0)
			{
				flag = 1;
				break;
			}	
		}

		// Excluded 0 and 1 from printing as prime number
		if(flag == 0 && num != 0 && num != 1 )
		{
			System.out.println( " It's a Prime number");
		}
		else
		{
			System.out.println("  Not a prime number");
		}

	}
}

