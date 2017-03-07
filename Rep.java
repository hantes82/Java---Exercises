
public class Rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-3, 4, 0, 4, 10, 14, 1, 0, 7, 7, 0};
		int regular = 0;
		int max = 0;
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			counter = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					counter++;
					if (counter > max) {
						regular = arr[i];
						max = counter;
					}
				}


			}

			System.out.println("Najczesciej w tablicy wystepuje: " + regular);
		}
	}
}





