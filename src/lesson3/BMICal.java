package lesson3;
import java.util.Scanner;
public class BMICal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Your height in inches: ");
		int height = input.nextInt();
		System.out.print("Your weight in pounds: ");
		int weight = input.nextInt();
		
		double h = height * 0.0254;
		double w = weight * 0.453592;
		float bm = (float) (w / Math.pow(h, 2));
		
		System.out.println("Your BMI is " + bm);
		
	}

}
