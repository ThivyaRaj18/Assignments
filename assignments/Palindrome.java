package week1.day2.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Variable declaration
		int num,original,reverse,remainder;

		//Prompt for user input and stored the value for comparison
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num =sc.nextInt();
		original = num;

		//Condition to reverse the original value and to be stored in one variable
		for(reverse=0;num>0;num=num/10)
		{
			remainder=num%10;
			reverse=(reverse*10)+remainder;
		}

		//Comparing the original and reverse values using if

		if(reverse==original)
			System.out.println(original+" is a palindrome number ");
		
		else
			System.out.println(original+" is not a palindrome number ");

	}

}
