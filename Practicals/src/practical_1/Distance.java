package practical_1;
import java.util.Scanner;

public class Distance {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter two points: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println("The distance between the two points is " + distance);
		input.close();
	}
}
