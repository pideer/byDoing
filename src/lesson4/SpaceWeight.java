package lesson4;
import java.util.Scanner;

public class SpaceWeight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double neWe;
		String planet[] = {"Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		
		System.out.print("Please enter your Earth weight: ");
		int weigh = input.nextInt();
		System.out.print("\nI have information on the following planets: \n"
						 + "   0. Venus   1. Mars   2. Jupiter\n"
						 + "   3. Saturn  4. Uranus 5. Neptune"
						 + "\n\nWhich planet will you be visiting? ");
		int planetNum = input.nextInt();
		
		switch (planetNum) {
		case 0:
			neWe = weigh * 0.78;
			System.out.println("Your weight would be " + neWe + " on " + planet[planetNum]);
			break;
		case 1:
			neWe = weigh * 0.39;
			System.out.println("Your weight would be " + neWe + " on " + planet[planetNum]);
			break;
		case 2:
			neWe = weigh * 2.65;
			System.out.println("Your weight would be " + neWe + " on " + planet[planetNum]);
			break;
		case 3:
			neWe = weigh * 1.17;
			System.out.println("Your weight would be " + neWe + " on " + planet[planetNum]);
			break;
		case 4:
			neWe = weigh * 1.05;
			System.out.println("Your weight would be " + neWe + " on " + planet[planetNum]);
			break;
		case 5:
			neWe = weigh * 1.23;
			System.out.println("Your weight would be " + neWe + " on " + planet[planetNum]);
			break;
		}

	}

}
