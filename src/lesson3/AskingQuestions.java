package lesson3;
import java.util.Scanner;

public class AskingQuestions{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		int age, heightFeet, heightInch;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		heightFeet = keyboard.nextInt();

		System.out.print("And how many inches? ");
		heightInch = keyboard.nextInt();
		
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " years old, " + heightFeet + "'" + heightInch + "\"" + " tall and " + weight + " lbs. heavy." );
	}
}