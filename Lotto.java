import java.util.Scanner;

import java.util.*;

public class Lotto {

	public static void main(String[] args) {
		int [] arrayLotto = new int [6];
		
		Random generator = new Random();
		 
		for(int i=0; i<6; i++) {
		 
		   arrayLotto[i] = (generator.nextInt(49));
		   	for (int j = i; j >= 0; j--) {
		   		if (arrayLotto[i] == arrayLotto[j])
		   			arrayLotto [i] = (generator.nextInt(49));
		   	}
		}
	
		for (int i=0; i<arrayLotto.length;i++) {
			System.out.println(arrayLotto[i]);
		}
		
		
		
	}

}
