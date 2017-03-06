
public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "0aSaa";
		if (text.substring(0,1).matches("[0-9]{1}")){
			 System.out.println("Pierwszy znak to cyfra"); 
			}
			else {
				System.out.println("Pierwszy znak nie jest cyfra");
			}

	}
}
		
		
		
		

