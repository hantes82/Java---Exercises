import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		float aver = 0;
		float [] tab = new float [10];
		Scanner scr = new Scanner (System.in);
		for (int i = 0; i<tab.length; i++) {
			System.out.println("Podaj liczbe nr: "+(i+1)+": " );
			tab[i] = scr.nextInt();
		}
		for (int i=0; i<tab.length; i++) {
			aver+=i;
		}
		
		System.out.println("Srednia to "+aver/10);
		
		
		
	}

}
