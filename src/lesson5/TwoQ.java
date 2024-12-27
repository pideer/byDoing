package lesson5;
import java.util.Scanner;

public class TwoQ {
	public static void main(String[] args) {
		int i = 0; int j = 0;
		String[][] min = {{"squirrel", "carrot", "paperclip"}, 
						  {"mouse","watermelon","Camaro"}};
		String[] sec = {"animal", "vegetable", "mineral"};
		String[] yn = {"no", "yes"};
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("TWO QUESTIONS!\nThink of an object and I'll try to guess it.");
		System.out.print("\nQuestion 1) Is it an animal, vegetable, or mineral?\n>");
		String que1 = input.next();
		for(;i<2;i++) {
			if (que1.equals(sec[i])) {
				break;
			} 
		}
		
		System.out.print("Question 2) Is it bigger then a Breadbox?\n>");
		String que2 = input.next();
		for(;j<1;j++) {
			if(que2.equals(yn[j]))
				break;
		}
		
		System.out.println("\nMy guess is that you're thinking of a " + min[j][i] + "."
					  + "\nI would ask you if I'm right, but I don't actually care.");
		//System.out.println(j +", "+ i);
	}
}