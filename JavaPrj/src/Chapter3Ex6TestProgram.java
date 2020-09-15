import java.io.IOException;

public class Chapter3Ex6TestProgram {

	public static void main(String[] args) throws IOException {

//		//반복과 인덱스 사용을 위한 예제
//		for (int j = 0; j < 10; j++) {
//			for (int i = 0; i < 10; i++)
//				if (j == 3)
//					System.out.print('○');
//				else
//					System.out.print('┼');
//
//			System.out.println();
//		}

//		for(int i = 0;i<10;i++) {
//			if(i>3) {
//				System.out.print('┼');
//			} else {
//				System.out.print('○');
//			}
//		}

//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++)
//				if (i == j)
//					System.out.print('○');
//				else
//					System.out.print('┼');
//			System.out.println();
//		}

//		for (int y = 1; y <= 10; y++) {
//			for (int x = 1; x <= 10; x++)
//					System.out.print('┼');
//
//			System.out.println();
//		}

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++)
				if (i == 0)
					if (j == 0 || j == 11)
						System.out.print(' ');
					else
						System.out.print('┬');
				else if (i == 11)
					if (j == 0 || j == 11)
						System.out.print(' ');
					else
						System.out.print('┴');
				else {
					if (j == 0 || j == 11)
						if (i == 10)
							System.out.print(0);
						else
							System.out.print(i);
					else
						System.out.print('┼');
				}

			System.out.println();
		}

	}

}
