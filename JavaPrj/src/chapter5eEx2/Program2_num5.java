package chapter5eEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program2_num5 {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

		// 로드 -----
		Member[] list = new Member[10];
		int count = 0;
		{
			int i = 0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");

				Member m = new Member();

				m.id = Integer.parseInt(tokens[0]);
				m.uid = tokens[1];
				m.name = tokens[2];
				m.age = Integer.parseInt(tokens[3]);

				list[i] = m;
				i++;
			}
			count = i;
		}
		scan.close();
		fis.close();
		

		// 나이순으로 내림차순

		for (int j = 0; j < count-1; j++) {// 사이즈가6이니까 정렬은 -1만큼 반복한다
			for (int i = 0; i < count - 1 - j; i++) {
				boolean sort_check = false;
				for (int a = 0; a < 50; a++)
					System.out.println();

				/////////////////////////////// 바뀌기 전
				/////////////////////////////// 출력/////////////////////////////////////////////////
				System.out.println("[바뀌기 전]");
				// 바뀌기 전 출력
				for (int a = 0; a < count; a++) {
					Member m = list[a];
					if (a == i || a == (i + 1))
						System.out.print("*");
					
					if(a>count-1-j||j==count-1-1)// j = 1 한번 반복했을때는 [a=5]  j=2 [a=5][a=4]  j=3 [a=5][a=4][a=3]   j=4  [5][4][3][2]   j=5 [5][4][3][2][1]
						//j가 4에서 끝이야 5가될수 없어 그래서 j==4면 남은 [a]들도 괄호로 덮게끔 j==4일때도 괄호하게 해줬어
						//a+j=6, a+j=7,6 a+j=8,7,6  따라서 a+j>5 되는거지 근데 5= count-1이랑 같아
						System.out.printf("[");
					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d", m.id, m.uid, m.name, m.age);
					
					if(a>count-1-j||j==count-1-1)
						System.out.printf("]");
					
					System.out.println();
				}

				Thread.sleep(500);

				//////////////////////////////// 내림차순정렬///////////////////////////////////////////////
				if (list[i].age > list[i + 1].age) {
					Member temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					sort_check = true;
				}

				//////////////////////////////// 바뀐 후 출력////////////////////////////////////////
				for (int a = 0; a < 50; a++)
					System.out.println();

				///////////// 순서가 정해지면 계속[]로 출력
				System.out.println("[바뀐 후]");

				for (int a = 0; a < count; a++) {
					Member m = list[a];

					if (sort_check && (a == i || a == i + 1))
						System.out.print("[");
					
					if(a>count-1-j||j==count-1-1)
						System.out.printf("[");
					
					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d", m.id, m.uid, m.name, m.age);
					
					if(a>count-1-j||j==count-1-1)
						System.out.printf("]");
					
					if (sort_check && (a == i || a == i + 1))
						System.out.print("]");

					System.out.println();

				}
				Thread.sleep(500);
			}
		}

//		for (int a = 0; a < 50; a++)
//			System.out.println();

		// 출력 -----
//		System.out.println("[최종결과]");
//		for (int j = 0; j < count; j++)
//			System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[j].id, list[j].uid, list[j].name, list[j].age);

		System.out.println("작업완료");

	}
}
