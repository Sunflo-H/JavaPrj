import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex7 {

	public static void main(String[] args) throws IOException {

		// scan.nextInt(); //데이터 변환의 오류가 있기 쉬워서 잘 사용하지 않음(정수형이 아니면 오류남, 스페이스로 구분된 경우만가능)

		// 전체 총점과 평균
		// 각 반의 총점과 평균
		// ┌─────────────────┑
		// │ 성적표 │
		// └─────────────────┙
		// [1반] 총점 : 802, 평균 : 80
		// [2반] 총점 : ....
		// ..
		// 전체 총점 : 1023, 평균 : 75...

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		// 데이터 로드
		int classes = 3;
		int students = 9;
		int[][] kors = new int[classes][students];

		int index = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			for (int j = 0; j < students; j++) {
				kors[index][j] = Integer.parseInt(tokens[j]);
			}
			index++;
		}

		scan.close();
		fis.close();

		// 총점 및 평균 구하기
		float[][] scores = new float[classes+1][2];

		for (int i = 0; i < classes; i++) {
			int sum = 0;
			float avg = 0;
			for (int j = 0; j < students; j++) {
				sum += kors[i][j];
			}
			scores[i][0] = sum; // 총점
			avg = (float) sum / students;
			scores[i][1] = avg; // 평균
		}

		// 전체 총점, 평균
		scores[3][0] = scores[0][0] + scores[1][0] + scores[2][0];
		scores[3][1] = scores[3][0] / (classes * students);

		// 출력
		System.out.println("┌──────────────────┐");
		System.out.println("│			성적표			│");
		System.out.println("└──────────────────┙");

		for (int i = 0; i < scores.length; i++) {
			if (i == 3)
				System.out.printf("[ 전체 ] 총점 : %4.0f, 평균 %6.2f\n", scores[i][0], scores[i][1]);
			else
				System.out.printf("[ %d반 ] 총점 : %4.0f, 평균 %6.2f\n", i + 1, scores[i][0], scores[i][1]);
		}

	}

}
