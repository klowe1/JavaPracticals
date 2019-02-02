package practical_1;
import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a temperature between -58F and 41F: ");
	double temperature = input.nextDouble();
	System.out.println("Enter a wind speed: ");
	double ogwind = input.nextDouble();
	double wind = Math.pow(ogwind, 0.16);
	double tempwind = (temperature * wind);
	double windchill = (35.74 + (0.6215 * temperature) - (35.75 * wind) + (0.4275 * tempwind));
	System.out.println("The wind-chill temperature is " + windchill);
	input.close();	
	} 
}