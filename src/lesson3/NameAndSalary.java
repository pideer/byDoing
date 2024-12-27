package lesson3;
import java.util.Scanner;

public class NameAndSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello. What is your name?");
		String name = input.next();
		System.out.println("\nHello " + name + "! How old are you?");
		int age = input.nextInt();
		System.out.println("\nSo, you're " + age + " eh? That's not old at all!\nHow much do you make " + name + "?");
		int sal = input.nextInt();
		System.out.println("\n" + sal + "! I hope that's per hour and not per year! LOL!");
	}

}
