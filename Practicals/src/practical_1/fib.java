package practical_1;

import java.util.Scanner;

public class fib {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of numbers for fib series: ");
		int amount = input.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 0; i < amount-2; i++) {
			int fib = num1 + num2;
			num1 = num2;
			num2 = fib;
			System.out.println(fib);
		}
		
		input.close();
	}
}

