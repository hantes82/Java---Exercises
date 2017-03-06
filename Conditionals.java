import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		System.out.println("Podaj pierwsz¹ liczbe: ");
		int a = scr.nextInt();
		System.out.println("Podaj drug¹ liczbe: ");
		int b = scr.nextInt();
		System.out.println("Podaj trzeci¹ liczbe: ");
		int c = scr.nextInt();
		if ((a<b) && (a<c) ) {
			System.out.println("Liczba: "+a+" jest najmniejsza.");
		}
		else if ((b<a) && (b<c)) {
			System.out.println("Liczba: "+b+" jest najmniejsza.");
			
		}
		else if ((c<a) && (c<b)) {
			System.out.println("Liczba: "+c+" jest najmniejsza.");
		}
		else {
			System.out.println("Wpisaleœ dwie identyczne liczby.");
		}
	}

}
