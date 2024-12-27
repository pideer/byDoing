package lesson3;
import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String i;
		System.out.println("Give me a word!");
		i = input.next();
		System.out.println("Give me a second word!");
		i = input.next();
		System.out.println("\nGreat, now your favorite number?");
		i = input.next();
		System.out.println("And your second favorite number...");
		i = input.next();
		System.out.println("\nWhew! Wasn't that fun?");
	}
}
