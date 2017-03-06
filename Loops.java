import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			System.out.println("Hello");
//		}
//		for(int i=1;i<=100;i++) {
//			if(i%7 == 0) {
//			System.out.println(i);
//			}
//		}
	Scanner scr = new Scanner(System.in);
	int result = 0;
	System.out.println("Podaj liczbe calkowita: ");
	int a = scr.nextInt();
	for (int i = 0; i<=a; i++) {
		result = result+i;
		
	}
	System.out.println("Wynik dodawania to: "+ result);
	}
}

