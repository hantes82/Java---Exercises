import java.util.Scanner;
public class Zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbe: ");
		float a = scr.nextInt();
		System.out.println("Podaj drug¹ liczbe: ");
		int b = scr.nextInt();
		System.out.println("Podaj trzeci¹ liczbe: ");
		int c = scr.nextInt();
		float sr = (a+b+c)/3;
		System.out.println(sr);
		
	}

}
