import java.util.Scanner;

public class Divide {
	public static  float div (float c, int d)
	{
		if (d == 0) {
			throw new IllegalArgumentException ("Cannot divide by 0");
		}
		float result = c/d;
		
		return result;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		System.out.println("Podaj pierwsz¹ liczbe: ");
		float a = scr.nextFloat();
		System.out.println("Podaj druga liczbe: ");
		int b = scr.nextInt();
		
		System.out.println(div(a,b));
		
			
		
		
		
		
	}

}
