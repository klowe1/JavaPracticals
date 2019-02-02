package practical_1;
import java.util.Scanner;

public class FindArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number as the radius: ");
		double radius = input.nextDouble();
		System.out.println("Enter a number as the length: ");
		double length = input.nextDouble();
		double area = radius * radius * Math.PI;
		double volume = area * length;
		System.out.println("The area of the cylinder is " + area);
		System.out.println("The volume of the cylinder is " + volume);
		input.close();
	}
	
	
	

}
