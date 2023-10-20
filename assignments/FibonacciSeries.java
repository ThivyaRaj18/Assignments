package week1.day2.assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		//Variable declaration
		int num1 = 0, num2 = 1, num3, maxrange;

		// Get the input from user and stored
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter max range:");
		maxrange = sc.nextInt();

		System.out.println(num1 );
		System.out.println(num2);

		//Condition to iterate till it reaches the max range
		for(int i=2;i<maxrange; i++) 
		{
			num3 =num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println(num3);
		}

	}

}
