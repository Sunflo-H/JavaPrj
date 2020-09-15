import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter3Ex5StringProgram2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		int num;
		int i = 0; // 반복 과정에서의 순서조건을 처리하기 위한 인덱스
		while (scan.hasNextInt()) {

			num = scan.nextInt();
			// 긍정적인 문장의 조건 : 읽어온 값이 50보다 큰 값만 출력하시오
			// if (num > 50)
			// System.out.println(num);

			// 반대로 조건을 작성하면?
			// 부정적으로 판단한 조건 : 50보다 작은거나 같은 값은 출력하지 마시오
			// if (num <= 50)
			/// continue;

			System.out.println(num);

			i++;
		}

		fis.close();

	}

}
