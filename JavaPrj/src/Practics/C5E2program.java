package Practics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import chapter5eEx2.Member;

public class C5E2program {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("res\\data5.txt");
		Scanner scan = new Scanner(fis);

		// 10개의 공간을 가지는 Member 객체배열 생성
		Member[] mList = new Member[10];

		// Member 객체 생성하고 데이터 입력 후 mList에 참조시켜서 10개의 공간에 넣기
		// 데이터 입력
		int countOfMember = 6;
		{
			int i = 0;
			int countOfData = 4;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = new String[countOfData];
				tokens = line.split(",");

				Member m = new Member();
				m.id = Integer.parseInt(tokens[0]);
				m.uid = tokens[1];
				m.name = tokens[2];
				m.age = Integer.parseInt(tokens[3]);

				mList[i] = m;
				i++;
			}
		}

		// 이름을 기준으로 내림차순 버블정렬
		for (int i = 0; i < countOfMember - 1; i++) {
			for (int j = 0; j < countOfMember - 1 - i; j++) {
				//화면 클리어
				for (int a = 0; a < 50; a++) 
					System.out.println();
				//출력
				for (int a = 0; a < countOfMember-1; a++) {
					if (mList[a].age > mList[a+1].age) 
						System.out.printf("*");
					System.out.printf("%d,%5s,%s,%3d\n", mList[a].id, mList[a].uid, mList[a].name, mList[a].age);
				}
				Thread.sleep(1000);
				if (mList[j].age > mList[j+1].age) {
					Member temp = mList[j];
					mList[j] = mList[j + 1];
					mList[j + 1] = temp;
					
				}
			}
		}

		// 출력 -----
//		for (int i = 0; i < countOfMember; i++) {
//			Member m = new Member();
//			m = mList[i];
//			System.out.printf("%d,%s,%s,%d\n", m.id, m.uid, m.name, m.age);
//		}
		System.out.println("작업완료");
	}
}