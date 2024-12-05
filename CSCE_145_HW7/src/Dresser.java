/*
 * 
 * Shawn Bolin
 */
import java.util.Scanner;
public class Dresser {
	private Clothing[][] clothes;
	public static final int DRAWERS = 5;
	public static final int DRAWER_SIZE = 10;

	Scanner keyboard = new Scanner(System.in);
	public Dresser() {
		this.clothes = new Clothing[DRAWERS][DRAWER_SIZE];
	}

	public void add(Clothing aC) {

		if (aC == null) {
			return;
		}
		if (aC.getType().equalsIgnoreCase("Undergarment")) {
			if(clothes[0][clothes[0].length-1] != null) {
				System.out.println("This drawer is full!");
				return;
			}
			for (int i = 0; i < clothes[0].length; i++) {
				if(clothes[0][i] == null) {
					clothes[0][i] = aC;
					break;
				}
			}
		}
		if (aC.getType().equalsIgnoreCase("Socks") || aC.getType().equalsIgnoreCase("Stockings")) {
			if(clothes[1][clothes[1].length-1] != null) {
				System.out.println("This drawer is full!");
				return;
			}
			for (int i = 0; i < clothes[1].length; i++) {
				if(clothes[1][i] == null) {
					clothes[1][i] = aC;
					break;
				}
			}
		}
		if (aC.getType().equalsIgnoreCase("Top")) {
			if(clothes[2][clothes[2].length-1] != null) {
				System.out.println("This drawer is full!");
				return;
			}
			for (int i = 0; i < clothes[2].length; i++) {
				if(clothes[2][i] == null) {
					clothes[2][i] = aC;
					break;
				}
			}
		}
		if (aC.getType().equalsIgnoreCase("Bottom")) {
			if(clothes[3][clothes[3].length-1] != null) {
				System.out.println("This drawer is full!");
				return;
			}
			for (int i = 0; i < clothes[3].length; i++) {
				if(clothes[3][i] == null) {
					clothes[3][i] = aC;
					break;
				}
			}
		}
		if (aC.getType().equalsIgnoreCase("Cape")) {
			if(clothes[4][clothes[4].length-1] != null) {
				System.out.println("This drawer is full!");
				return;
			}
			for (int i = 0; i < clothes[4].length; i++) {
				if(clothes[4][i] == null) {
					clothes[4][i] = aC;
					break;
				}
			}
		}

	}
	public void remove(Clothing aC) {
		if (aC == null) {
			return;
		}
		if (aC.getType().equalsIgnoreCase("Undergarment")) {
			for (int i = 0; i < clothes[0].length; i++) {
				if(clothes[0][i] != null) {
					if(clothes[0][i].equals(aC)) {
						clothes[0][i] = null;
						break;
					}
				}
			}
		}
		if (aC.getType().equalsIgnoreCase("Socks") || aC.getType().equalsIgnoreCase("Stockings")) {
			for (int i = 0; i < clothes[1].length; i++) {
				if(clothes[1][i] != null) {
					if(clothes[1][i].equals(aC)) {
						clothes[1][i] = null;
						break;
					}
				}
			}
		}
		if (aC.getType().equalsIgnoreCase("Top")) {
			for (int i = 0; i < clothes[2].length; i++) {
				if(clothes[2][i] != null) {
					if(clothes[2][i].equals(aC)) {
						clothes[2][i] = null;
						break;
					}
				}
			}
		}
		if (aC.getType().equalsIgnoreCase("Bottom")) {
			for (int i = 0; i < clothes[3].length; i++) {
				if(clothes[3][i] != null) {
					if(clothes[3][i].equals(aC)) {
						clothes[3][i] = null;
						break;
					}
				}

			}
		}
		if (aC.getType().equalsIgnoreCase("Cape")) {
			for (int i = 0; i < clothes[4].length; i++) {
				if(clothes[4][i] != null) {
					if(clothes[4][i].equals(aC)) {
						clothes[4][i] = null;
						break;
					}
				}
			}
		}
	}
	public void print() {
		for (int i = 0; i < clothes.length; i++) {
			System.out.println("Dresser " + i);
			for (int j = 0; j < clothes[i].length; j++) {
				if (clothes[i][j] != null) {
					System.out.println(clothes[i][j].toString());
				}
			}
		}
	}
}