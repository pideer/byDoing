package lesson1;

public class NumbersAndMath {

	public static void main(String[] args) {
		System.out.println("I will now count my chickens:");
		//prints 25 plus 30 divided by 6
		System.out.println("Hens " + ((float)25 + 30 / 6));
		//prints the remainder of 100 minus 25 times 3 divided by 4
		System.out.println("Roosters " + ((float)100 - 25 * 3 % 4));

		System.out.println("Now I will count the eggs:");
		//prints 3 plus 2 plus  1 minus 5 plus 4 remainder of that divided by 2 minus 1 divided by 4 plus 6
		System.out.println((float)3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);

		System.out.println("Is it true that 3 + 2 < 5 - 7?");
		// prints 3 plus 2 is less then 5 minus 7
		System.out.println((float)3 + 2 < 5 - 7);
		//prints 3 plus 2
		System.out.println("What is 3 + 2? " + ((float)3 + 2));
		//prints 5 minus 7
		System.out.println("What is 5 - 7? " + ((float)5 - 7));

		System.out.println("Oh, that's why it's false.");

		System.out.println("How about some more.");
		//prints 5 is greater then negative 2
		System.out.println("Is it greater? " + (5 > -2));
		//prints 5 is greater then or equal to negative 2
		System.out.println("Is it greater or equal? " + (5 >= -2));
		//prints 5 is less then or equal to negative 2
		System.out.println("Is it less or equal? " + (5 <= -2));
	}
}
