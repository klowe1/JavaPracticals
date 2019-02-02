package practical_1;

import java.util.Scanner;

public class Starpattern {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of stars: ");
		int amount = input.nextInt();
		
		for (int i = 0; i < amount; i++) {
			for (int j = 0; j < amount - i - 1; j++) {
				System.out.print(" ");	
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}
}


