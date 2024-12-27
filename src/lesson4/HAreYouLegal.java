package lesson4;
import java.util.Scanner;

public class HAreYouLegal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Hey, what's your name?\n> ");
		String name = input.nextLine();
		System.out.print("So " + name + ", how old are you?\n> ");
		int age = input.nextInt();
		if(age < 16)
			System.out.println("You can't drive, " + name);
		if(age < 18)
			System.out.println("You can't vote, " + name);
		if(age < 25)
			System.out.println("You can't rent a car, " + name);
		if(age > 25)
			System.out.println("You can do anything legal, " + name);
	}

}
