import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter3Ex5StringProgram3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		int num;
		int i = 0; // 반복 과정에서의 순서조건을 처리하기 위한 인덱스

		while (scan.hasNextInt()) {
			// i를 활용하는게 헷갈리면
			// int n = i+1; 이라는 변수를 만들어 생각해라,, 위에서 i=1로 만드는 것은 지양

			num = scan.nextInt();
			// 1. 짝수 번째 값만 출력
//			if (i % 2 == 1)
//				System.out.println(num);

			// 2. 짝수 번째면서 50보다 큰 값만 출력
//			if (i % 2 == 1 && num > 50)
//				System.out.println(num);

			// 3. 4번째부터 출력
			if (i < 3) {
				i++;
				continue;
			}
								
			System.out.println(num);

			// 4. 4번째까지 출력 --> 5번재부터 필요 없다는 것은 break문을 쓰라는 것이다.
//			if (i > 3)
//				break;
//			System.out.println(num); 

			i++;
		}

		fis.close();

	}

}
