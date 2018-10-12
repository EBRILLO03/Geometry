import java.io.InputStream;
import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {
		Scanner scan = newScanner(System.in);
		System.out.print("Please enter your name:     ");
		String name;
		name = scan.nextLine();
		System.out.println("\n\nHello, " + name + ", welcome to the geometry calculator.");
		System.out.println("Press enter to continue...");
		scan.nextLine();
		System.out.println("AREA OF A TRIANGLE");
		System.out.print("Please enter the measure of the base");
		String base8tr =  scan.nextLine();
		System.out.println("Please enter the measure of the height");
		String height8tr = scan.nextLine();
		double base8tr;
		base = double.parceDouble(base8tr);
		double height = double.parceDouble(height8tr);
		System.out.println("Please enter a unit of measurement:    ");
		String unit = scan.nextLine();
		double area = .5*(base*height);
		System.out.println("The area of a triangle is " + area + unit "2");
		
	}

	private static Scanner newScanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
