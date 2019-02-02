package practical_1;

import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of years: ");
		int year = input.nextInt();
		int births = ( 31536000 / 7);
		int deaths = ( 31536000 / 13);
		int immigrants = ( 31536000 / 45);
		int increase = (births - deaths + immigrants);
		int currpop = 312032486;
		int newpop = (currpop + (increase * year));
		System.out.println("Population after this number of years is: " + newpop );
		input.close();
	}
	
}
