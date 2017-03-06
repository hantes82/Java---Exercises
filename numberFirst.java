import java.util.Scanner;

public class numberFirst {
	public boolean numFirst (int num) {
		boolean result;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return false;
			}
	
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberFirst first = new numberFirst();
		Scanner scr = new Scanner(System.in);
		System.out.println("Podaj liczbe do sprawdzenia: ");
		int l = scr.nextInt();
		System.out.println("Czy liczba "+l+" jest pierwsza?\n"+first.numFirst(l));
	}

}
