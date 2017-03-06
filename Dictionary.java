import java.util.Scanner;



import java.util.HashMap;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> myMap = new HashMap <String, String> ();
		Scanner scr = new Scanner (System.in);
		
		
		
		myMap.put ("Mother", "Matka");
		myMap.put ("Father", "Ojciec");
		myMap.put ("Brother", "Brat");
		myMap.put ("Sister", "Siostra");
		myMap.put ("Uncle", "Wuj");
		myMap.put ("Aunt", "Ciotka");
		
		System.out.println("Podaj slowo po angielsku: ");
		String w = scr.next();
		
		
		
		
		String j = myMap.getOrDefault(w, "Brak tlumaczenia");
		
		
		
		System.out.println(j);
		
		
		
		
		
		
		
	}
	

}
