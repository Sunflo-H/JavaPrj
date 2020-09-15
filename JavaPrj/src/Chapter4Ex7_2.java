import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex7_2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data2.txt");
		Scanner scan = new Scanner(fis);

		
		int row = 3;
		int col = 9;

		int[][] kors = new int[row][col]; // 데이터 저장소

		for (int c = 0; c < row; c++) {
			// 파일을 읽어서 데이터 저장소에 값을 채워라
			String line = scan.nextLine();
			String[] tokens = line.split(",");

			for (int i = 0; i < col; i++)
				kors[c][i] = Integer.parseInt(tokens[i]); // "60" -> 60

		}

		// 계산 -----------------------------------
		int[] totals = new int[3];
		float[] avgs = new float[3];

		// 각 반의 총점과 평균을 구하기
		for (int c = 0; c < row; c++) {
			for (int i = 0; i < col; i++)
				totals[c] += kors[c][i];

			avgs[c] = totals[c] / (float) col;
		}

		// 전체 총점과 평균을 구하기

		int total = 0;
		float avg = 0;

//      for(int i=0; i<col; i++)
//         totals[1] += kors[0][i];      
//      
//      avgs[1] = totals[1] / (float)col;
//      
//      for(int i=0; i<col; i++)
//         totals[2] += kors[0][i];      
//      
//      avgs[2] = totals[2] / (float)col;

		// 출력 -----------------------------------

		for (int i = 0; i < row; i++)
			System.out.printf("[%d반] 총점 : %d,  평균 : %6.2f\n", i + 1, totals[i], avgs[i]);
//      for(int c=0; c<row; c++) {
//         for(int i=0; i<col; i++) {
//            System.out.printf("%3d", kors[c][i]);
//            
//            if(i < 8)
//               System.out.print(",");
//         }
//         
//         System.out.println();
//      }

		// --------------- 성적 콘솔 출력 -----------
//      App -> 문자열 단위 출력 PrintStream ->   File -> OutputStream -> 바이트 단위 출력
//               Console -> 
//               Socket -> 
//      
//       write(숫자);
//       print(문자열); -> print(12) -> print("12")
//       
//       print();
//       println(); // 문자열에는 특수한 문자가 포함될 수 있다. \n
//       printf();

		int kor = 30;
		int eng = 30;
		int math = 40;
		// System.out.printf("kor:%d eng:%3$d maht:%2$d\n", kor, math, eng );

		// System.out.printf("month : %03d", 3);

	}

}