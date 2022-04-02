package Arrays;

public class ArrayBidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 8, 5, 4 } };
		//System.out.println(arr[2][2]);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
