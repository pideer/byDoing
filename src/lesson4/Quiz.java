package lesson4;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Are you ready for the quiz? ");
		String yn = input.next();
		System.out.println("Okay, here it comes!");
		
		System.out.println("Q1) What is the capitol of Alaska?"
						 + "\n\t1) Melbourne"
						 + "\n\t2) Anchorage"
						 + "\n\t3) Juneau");
		System.out.print("> ");
		int a = input.nextInt();
		switch (a) {
		case 3:
			i++;
			System.out.println("That's right!");
			break;
		default:
				System.out.println("Wrong!");
			}
		System.out.println("Q2) Can you store the value \"Cat\" in a int type?"
						 + "\n\t1) Yes"
						 + "\n\t2) No");
		System.out.print("> ");
		int b = input.nextInt();
		switch (b) {
		case 2:
			i++;
			System.out.println("That's right!");
			break;
		default:
				System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
			}
		System.out.println("Q3) What is the result of 9+6/3?"
						 + "\n\t1) 5"
						 + "\n\t2) 11"
						 + "\n\t3) 15/3");
		System.out.print("> ");
		int c = input.nextInt();
		switch (c) {
		case 2:
			i++;
			System.out.println("That's right!");
			break;
		default:
				System.out.println("BOi...");
			}
		System.out.println("Overall, you got " + i + " out of 3 right.\n"
				+ "Thanks for playing!");
	}

}
