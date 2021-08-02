import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int num;
	
	//method to check palindrome
	public void checkPalindrome() {
		int rev, temp, sum = 0;
		System.out.println("Enter the number to check Palindrome\n");
		num = sc.nextInt();
		
		temp = num;
		while(num > 0) {
			rev = num % 10;
			sum = (sum * 10) + rev;
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println(temp + " is a palindrome.");
		}
		else {
			System.out.println(temp + " is not a palindrome.");
		}
		
		System.out.println();
	}
	
	//function to print pattern
	public void printPattern() {
		System.out.println("Enter the number to print pattern\n");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	//function to check prime or not
	public void checkPrimeNumber() {
		System.out.println("Enter the number to check prime\n");
		num = sc.nextInt();
		
		int i = 2;
		boolean isPrime = false;
		
		while(i <= num / 2) {
			if(num % i == 0) {
				isPrime = true;
				break;
			}
			i++;
		}
		
		if(! isPrime) {
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is not a prime number.");
		}
		
		System.out.println();
		
	}
	
	//function to print fibonacci series
	public void printFibonacciSeries() {
		int first, second, sum;
		
		System.out.println("Enter the number to print fibonacci\n");
		num = sc.nextInt();
		
		System.out.println("Enter the first number in the series\n");
		first = sc.nextInt();
		
		System.out.println("Enter the second number in the series\n");
		second = sc.nextInt();
		
		System.out.print(first);
		
		for(int i = 1; i < num; i++) {
			sum = first + second;
			System.out.print("," + second);
			first = second;
			second = sum;
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("Enter your choice from below list\n" +
					"1. Find palindrome of number\n" + 
					"2. Print Pattern of a given number\n" + 
					"3. Check whether a number is prime or not\n" +
					"4. Print Fibinocci series\n" +
					"Enter 0 to exit.\n");
			
			System.out.println();
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				choice = 0;
				break;
			case 1:
				obj.checkPalindrome();
				break;
			case 2:
				obj.printPattern();
				break;
			case 3:
				obj.checkPrimeNumber();
				break;
			case 4:
				obj.printFibonacciSeries();
				break;
			default:
				System.out.println("Invalid choice. Enter a valid number.\n");
			}
		}
		while(choice != 0);
		System.out.println("Exited Successfully!");
		sc.close();
	}
}
