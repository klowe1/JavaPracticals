package practical_1;
import java.util.Scanner;

public class drivingcost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance to drive: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double milesG = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double priceG = input.nextDouble();
		double cost = ((distance / milesG) * priceG);
		System.out.println("The cost of the journey is: " + cost);
		input.close();
	}

}
