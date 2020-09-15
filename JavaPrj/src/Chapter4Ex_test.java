
public class Chapter4Ex_test {

	public static void main(String[] args) {

		int days = 31;
		for (int i = 0; i < days; i++) {

			System.out.printf("%d	", i + 1);
			if (i % 7 == 6)
				System.out.println();

		}

//		for (int i = 0; i < days; i++) {
//			int n = i + 1;
//			if (n < 10)
//				System.out.printf(" %d ", n);
//			else
//				System.out.printf("%d ", n);
//			if (n % 7 == 0)
//				System.out.println();
//		}

	}

}
