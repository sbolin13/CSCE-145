/*
 * Shawn Bolin 
 */
import java.util.Scanner;
public class DresserFrontEnd {
	private static Scanner keyboard = new Scanner(System.in);
	private static Dresser dresser = new Dresser();
	public static void main(String[] args) {
		printGreeting();
		boolean quit = false;
		while(!quit) {
			printChoices();
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch (choice){
			case 1:
				addClothing();
				dresser.print();
				break;
			case 2:
				removeClothing();
				dresser.print();
				break;
			case 7:
				quit = true;
				break;
			}
		}


	}
	public static void addClothing() {
		System.out.println("Enter the type of clothing. Options are"
				+ "\nUndergarment, Socks, Stockings, Top, Bottom, or Cape.");
		String type = keyboard.nextLine();
		System.out.println();
		System.out.println("Enter the color of the clothing. Options are"
				+ "\nBrown, Red, Pink, Black, White, Orange, Green, Blue,"
				+ "\nPurple, or Grey");
		String color = keyboard.nextLine();
		keyboard.nextLine();
		System.out.println();
		dresser.add(new Clothing(type, color));
	}
	public static void removeClothing() {
		System.out.println("Enter the type of clothing. Options are"
				+ "\nUndergarment, Socks, Stockings, Top, Bottom, or Cape.");
		String type = keyboard.nextLine();
		System.out.println("Enter the color of the clothing. Options are"
				+ "\nBrown, Red, Pink, Black, White, Orange, Green, Blue,"
				+ "\nPurple, or Grey");
		String color = keyboard.nextLine();
		dresser.remove(new Clothing(type, color));
	}
	public static void printGreeting() {
		System.out.println("Welcome to the clothes sorter!");
	}
	public static void printChoices() {
		System.out.println("Enter 1 to add clothing"
				+ "\nEnter 2 to remove clothing"
				+ "\nEnter 7 to quit");
	}
}
