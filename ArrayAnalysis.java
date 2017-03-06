import java.util.Scanner;

public class ArrayAnalysis {
	
	public static int[][] arrayAdd(int rows, int cols) {
		Scanner scr = new Scanner(System.in);
		int [][] array = new int [rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("Podaj kolejna liczbe: ");
				array[i][j] = scr.nextInt();
			}
		}
		return array;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scr = new Scanner(System.in);
		System.out.println("Podaj liczbe wierszy: ");
		int row = scr.nextInt();
		
		System.out.println("Podaj liczbe kolumn: ");
		int col = scr.nextInt();
		
		int [][] tab = arrayAdd(row,col);
		
		for (int i=0; i < tab.length; i++){
			for (int j = 0; j< tab[i].length; j++) {
				System.out.println(tab[i][j]);
			}
		}

	}

}
