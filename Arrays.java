
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] m = new int [] {1,2,3,4,5,6};
//		int [] n = new int[8];
//		
//		for (int i = 0; i<m.length; i++) {
//			System.out.println(m[i]);
//		}
//		for (int i : m) {
//			System.out.println(i);
//		}
		
		int [][] twoDimArray = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i<twoDimArray.length;i++) {
			for (int j = 0; j < twoDimArray[i].length; j++  ) {
				System.out.println(twoDimArray[i][j]);
			}
		}
		
	}

}

