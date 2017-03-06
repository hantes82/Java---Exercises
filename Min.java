import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		int [] m = new int [8];
		
		for (int i = 0 ; i<m.length;i++) {
			System.out.println("Podaj kolejny element tablicy: ");
			m[i] = scr.nextInt();

		}
		
		
		int wynik = m[0];
		for (int a=1;a<m.length; a++) {
			if(m[a]<wynik) {
				wynik = m[a];
			}
		}
		System.out.println("Najmniejszy element tablicy to: "+wynik);
		
	}
	

}
