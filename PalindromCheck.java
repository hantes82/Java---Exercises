import java.util.*;

public class PalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "kajask";
		StringBuilder builder = new StringBuilder(word);

		boolean eq = builder.reverse().toString().equals(word);
		
		
		
		if (eq) {
				
					System.out.println("Slowo jest palindromem");
				
		}	
		else {
			System.out.println("Slowo nie jest palindromem");
		}
		
		}
	}


