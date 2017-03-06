import java.util.Scanner;

public class Silnia {
	public long countSilnia (int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result*=i;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Silnia sil = new Silnia();
		Scanner scr = new Scanner (System.in);
		System.out.println("Podaj liczbe, ktorej silnie chcesz obliczyc: ");
		int arg = scr.nextInt();
		System.out.println("Silnia liczby: "+arg+" to: "+ sil.countSilnia(arg));
	}

}
