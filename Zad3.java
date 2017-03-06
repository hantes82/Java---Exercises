import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Podaj liczbe miejsc: ");
		int numSits = scr.nextInt();
		System.out.println("Podaj liczbe rzedow: ");
		int numRows = scr.nextInt();
		int result = numSits/numRows;
		int plusSits = numSits%numRows;
		System.out.println("Liczba miejsc w rzedzie wynosi: " +result );
		System.out.println("Liczba miejsc w ostatnim rzedzie wynosi: "+plusSits);
		

	}

}
