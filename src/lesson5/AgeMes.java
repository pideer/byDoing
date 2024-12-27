package lesson5;
import java.util.Scanner;

public class AgeMes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Your name\n> ");
		String name = input.next();
		System.out.println("Your age\n> ");
		int age = input.nextInt();
		
		if(age < 16)
			System.out.println();

	}

}
