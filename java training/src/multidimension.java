
public class multidimension {

	public static void main(String[] args) {
		int myarray1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < myarray1.length; i++) {
			for (int j = 0; j < myarray1[i].length; j++) {
				System.out.print(myarray1[i][j] + "\t");
			}
			System.out.println();
		}
	/*
		for(int i:myarray1) {
			for (int j:myarray1[i]) {
				System.out.print(myarray1[i][j] + "\t");
			}
			System.out.println();
		}
		*/
	}

}
