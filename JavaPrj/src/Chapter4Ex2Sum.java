import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex2Sum {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		// 배열의 크기 -> 파일의 헤더에 등록된 데이터 수를 가져온다.
		int size = scan.nextInt();

		int[] nums = new int[size];

		// 배열에 데이터를 읽어(로드)온다.
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}

		fis.close();

		// =========데이터 조작=============================
		// 1. 데이터의 총합을 구하시오
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += nums[i];
		}
		System.out.println(sum);

		// 1-2. 작수의 합만 구하기
		int sum2 = 0;
		for (int i = 0; i < size; i++) {
			if (nums[i] % 2 == 0)
				sum2 += nums[i];
		}
		System.out.println(sum2);

		// 2. 짝수의 개수를 출력하시오.
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (nums[i] % 2 == 0)
				count++;
		}
		System.out.println(count);

		// =========정렬=============================
		// 출력
		for (int i = 0; i < size; i++)
			System.out.printf("%d ", nums[i]);

		// [60 70 90 100 75 24 23 80 90]
		// [23 24 60 70 75 80 90 90 100]
		// 정렬
		// 임시 변수를 선언해 활용한다!!!!!!

		System.out.println();
		int temp = nums[0];
		nums[0] = nums[6];
		nums[6] = temp;

		// 다시 출력해서 확인
		for (int i = 0; i < size; i++)
			System.out.printf("%d ", nums[i]);

		// =========데이터 저장=============================
		FileOutputStream fos = new FileOutputStream("res/result.txt");
		fos.write(count);
		fos.flush();
		fos.close();

	}

}