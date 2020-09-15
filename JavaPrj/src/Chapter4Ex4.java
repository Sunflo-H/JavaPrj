import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Chapter4Ex4 {

	public static void main(String[] args) throws IOException {

		// 새로운 도구 랜덤 값을 제공하는 도구
//		Random rand = new Random();
//
//		System.out.println(rand.nextInt(6) + 1);
//		System.out.println(rand.nextInt(6) + 1);
//		System.out.println(rand.nextInt(6) + 1);
//		System.out.println(rand.nextInt(6) + 1);
//		System.out.println(rand.nextInt(6) + 1);

		// 문자열 배열

		FileInputStream fis = new FileInputStream("res/list.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

		int total = scan.nextInt();
		System.out.println(total);
		scan.nextLine();

		int[] nums = new int[total];
		String[] list = new String[total];

		{
			int i = 0;
			while (scan.hasNextLine()) {
				String name = scan.nextLine();
				list[i] = name;
				i++;
			}
		}
		fis.close();

		Random rand = new Random();
		int s = 0;
		int d = 0;

		for (int i = 0; i < 1000; i++) {
			s = rand.nextInt(total);
			d = rand.nextInt(total);
			String temp;
			temp = list[s];
			list[s] = list[d];
			list[d] = temp;
		}

		int j = 1;
		int div = 4;
		int classes = 6;
		for (int i = 0; i < total; i++) {
			if (i % div == 0)
				if (i == classes * div) {
					System.out.printf("======나머지조======\n");
				} else if (i % div == 0 && i < classes * div) {
					System.out.println("======" + (i / div + 1) + "조======");
				}
			System.out.println(list[i]);
		}
		
	}

}
