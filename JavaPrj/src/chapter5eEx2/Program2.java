package chapter5eEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

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
		// 로드 -----

		// 나이순으로 내림차순
		
		for (int i = 0; i < count - 1; i++) {// 사이즈가6이니까 정렬은 -1만큼 반복한다
			for (int j = 0; j < count - 1 - i; j++) {
				boolean sort_check = false;
				for (int a = 0; a < 50; a++)
					System.out.println();
///////////////////////////////////////////////바뀌기 전 출력/////////////////////////////////////////////////
				System.out.println("[바뀌기 전]");
				// 기본형
//				for (int a = 0; a < count; a++) {
//					if (a == j || a == (j + 1))
//						System.out.print("*");
//					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[a].id, list[a].uid, list[a].name,
//							list[a].age);
//				}
				// 내 응용형
				for (int a = 0; a < count; a++) {
					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d", list[a].id, list[a].uid, list[a].name,
							list[a].age);
					if (a == j || a == (j + 1))
						System.out.print("<-\n");
					else
						System.out.printf("\n");
				}
				Thread.sleep(1000);

////////////////////////////////////////////////내림차순정렬///////////////////////////////////////////////
				if (list[j].age > list[j + 1].age) {
					Member temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					sort_check = true;
				}

////////////////////////////////////////////////바뀐 후 출력////////////////////////////////////////
				// 기본형
//				for (int a = 0; a < 50; a++)
//					System.out.println();
//				System.out.println("[바뀐 후]");
//				for (int a = 0; a < count; a++)
//					if (((a == j)&&(sort_check==true)) || ((a == j+1)&&(sort_check==true))) {
//						System.out.printf("[id:%d, uid:%5s, name:%s, age:%3d]\n", list[a].id, list[a].uid, list[a].name,list[a].age);
//					} else
//						System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[a].id, list[a].uid, list[a].name,list[a].age);
//				Thread.sleep(1000);
//				for (int a = 0; a < 50; a++)
//					System.out.println();

				// 내 응용형
				for (int a = 0; a < 50; a++)
					System.out.println();

//				System.out.println("[바뀐 후]");
//				for (int a = 0; a < count; a++) {
//					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d", list[a].id, list[a].uid, list[a].name,
//							list[a].age);
//					if (sort_check) {
//						if (a == j)
//							System.out.printf("<┓");
//						else if (a == j + 1) {
//							System.out.printf("<┛");
//						}
//					}
//					System.out.printf("\n");
//				}
				
				/////////////선생님 풀이
				System.out.println("[선생님 풀이]");
				for(int a= 0; a<count;a++) {
					Member m = list[a];
					
					if(sort_check && (a==j || a==j+1))
						System.out.print("[");
					
					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d", m.id, m.uid, m.name,m.age);
					
					if(sort_check && (a==j || a==j+1))
						System.out.print("]");
					
					System.out.println();
				}

				Thread.sleep(1000);
				
			}
		}

		for (int a = 0; a < 50; a++)
			System.out.println();

		// 출력 -----
		System.out.println("[최종결과]");
		for (int j = 0; j < count; j++)
			System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[j].id, list[j].uid, list[j].name, list[j].age);

		System.out.println("작업완료");

	}
}
