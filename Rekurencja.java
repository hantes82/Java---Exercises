
public class Rekurencja {
	
	public void counter (int a) {
		System.out.println(a);
		if (a<10) {
			counter (a+1);
		}
	}
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Rekurencja rek = new Rekurencja();
		rek.counter(5);
		
	
		}
		
		
	}


