package lesson3;
import java.util.Scanner;

public class AgeIn5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello! What's your name?");
		String name = input.nextLine();
		System.out.println("Hi, " + name + "! How old are you?");
		int age = input.nextInt();
		System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
	}

}
