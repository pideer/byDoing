package lesson3;
import java.util.Scanner;
public class DumCalcul {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your first number? ");
		double num1 = input.nextDouble();
		System.out.print("What is your second number? ");
		double num2 = input.nextDouble();
		System.out.print("What is your third number? ");
		double num3 = input.nextDouble();
		System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 2 is... " + ((num1 + num2 + num3)/2));
	}

}
