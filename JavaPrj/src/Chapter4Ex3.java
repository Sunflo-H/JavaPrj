
public class Chapter4Ex3 {

	public static void main(String[] args) {

//		int[] kors = new int[15];
//
//		kors[1 * 5 + 2] = 30;
//		kors[2 * 5 + 3] = 40;

		int[][] kors = new int[3][5];

		kors[1][2] = 30;
		kors[2][3] = 40;

		System.out.println("-------------1¹Ý-------------");
		for (int i = 0; i < 5; i++)
			System.out.printf("%d ", kors[0][i]);
		System.out.println();

		System.out.println("-------------2¹Ý-------------");
		for (int i = 0; i < 5; i++)
			System.out.printf("%d ", kors[1][i]);
		System.out.println();

		System.out.println("-------------3¹Ý-------------");
		for (int i = 0; i < 5; i++)
			System.out.printf("%d ", kors[2][i]);
		System.out.println();

		
		
	}

}
