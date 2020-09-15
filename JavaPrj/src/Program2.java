public class Program2 {

	public static void main(String[] args) {

		loop:
		for (int j = 0; j < 100; j++) {

			for (int i = 0; i < 100; i++) {
				if (i + 1 > 5)
					break loop;

				System.out.printf("%d ", i + 1);
			}

			System.out.println();

		}

	}

}
