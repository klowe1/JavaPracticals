package practical_1;

import java.util.Scanner;

public class AreaSquare {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter height: ");
		double height = input.nextDouble();
		System.out.println("Enter width: ");
		double width = input.nextDouble();
		double area = (height * width);
		if (area < 100) {
			System.out.println("cost is per square ft €20 " + (area * 20));
		}
		else {
			System.out.println("cost is €25 " + (area * 25));
		}
		input.close();
	}
}
