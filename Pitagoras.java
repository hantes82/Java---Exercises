import java.util.Scanner;



public class Pitagoras {
	public static boolean check (int a,int b, int c) {
		boolean checkVal = false;
		if (a*a+b*b==c*c) {
			checkVal = true;
		}
		return checkVal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean check = false;
		Scanner scr = new Scanner (System.in);
		System.out.println("Podaj pierwsz¹ liczbe: ");
		int c = scr.nextInt();
		System.out.println("Podaj druga liczbe: ");
		int d = scr.nextInt();
		System.out.println("Podaj trzecia liczbe: ");
		int e = scr.nextInt();
		System.out.println(check(c,d,e));
		Pitagoras pit = new Pitagoras();
		System.out.println(pit.check(c, d, e));
	}

}
//lub stworzyc obiekt Pitagoras i na nim wywolac funkcje check