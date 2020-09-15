import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex2Sum2 {

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

		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1. 버블정렬 : 인접한 두 수를 비교하면서 정렬
		// [60 70 90 100 75 24 23 80 90]
		// 1 pass : [60 70 90 75 24 23 80 90 100]
		// 2 pass : [60 70 75 24 23 80 90 90 100]

		// 1-1 : 1pass 구현
		for (int i = 0; i < size - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				int temp;
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
			}
		}

		for (int i : nums) {
			System.out.print(i + " ");
		}

		// 1-2 : 버블정렬 전체 반복 구현
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println();

		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

}
