
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ala ma kota";
		String k = new String ("Ala ma kota");
			
		//String pool - przy porownaniu napisow w tym samym miejscu w pamieci pokazuje equals i == ze to to samo
		// w przypadku stworzenia tego samego napisu konstruktorem  equals pokaze ze to to samo ale == juz nie 

		String n = "Ala ma kota";
		String s1 = n.concat(" i psa");
		System.out.println(s1);
		
		//concat() - laczy ciag znakow
		//substring () - moze miec jedne lub dwa argumenty- przy jednym to poczatek ciagu wycinanego, a przy dwoch poczatek i koniec
		//equalsIgnoreCase() - sprawdza ale ignoruje wielkosc liter
		//startsWith("")
		//endsWith("")
		//indexOf('') - podaje index szukanego elementu
		//lastIndexOf ('') - ostatni index wystapienia elementu
		//trim() usuwa space na poczatku i koncu ciagu znakow
		//contains("") - zwraca wartosc logiczna
		//matches() sprawdza maske np dla kodu pocztowego "[0-9]{2}-[0-9]{3}" dla liter - [a-zA-Z@]
		//split("") dzieli i tworzy tablice z ciagami znakow
		//charAt(numer indexu) podaje litere w stringu na zadanej pozycji
		String i1 = "Ala";
		String i2 = "ALA";
		boolean isEq = i1.equalsIgnoreCase(i2);
		System.out.println(isEq);
		System.out.println(i1.length());
		
		String email = "user@email.com";
		String [] tab = email.split("@");
		System.out.println(tab[0]);
		System.out.println(tab[1]);
	}

}
