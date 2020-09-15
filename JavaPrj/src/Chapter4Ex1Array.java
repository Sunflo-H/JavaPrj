import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex1Array {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		FileOutputStream fos = new FileOutputStream("res/result.txt");
		Scanner scan = new Scanner(fis);

		// 1. 정수(int) 배열 nums라는 이름으로 정수 10개짜리 배열을 마련해주세요

		int[] nums = new int[10];

		for (int i = 0; i < 8; i++) {
			// 2. nums 배열의 첫번째 위치에 data.txt에서 첫번째 값(60)을 읽어서 넣으세요
			// 3. 원하는 방향 : 읽어온 값을 nums 배열의 i번째 위치에 대입하시오.
			nums[i] = scan.nextInt();
		}
		System.out.println(nums[0]);
		System.out.println(nums[1]);

		fis.close();
		fos.close();

	}

}