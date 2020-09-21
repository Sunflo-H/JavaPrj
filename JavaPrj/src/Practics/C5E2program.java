package Practics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import chapter5eEx2.Member;

public class C5E2program {

	public static void main(String[] args) throws IOException, InterruptedException {
//		1. 정렬할때 뭐가 정렬되는지 표시하기
//		2. 정렬되기 전에 표시하고 정렬후에는 표시 없이 출력
//		3. 3에 이어서 정렬이 발생하면 출력시 정렬된거에 [] 표시
//		4. 4에 이어서 결정된 값은 []영구표시

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
				boolean check =false;
				//정렬 되기 전 출력
				for (int a = 0; a < 50; a++) 
					System.out.println();
				for (int a = 0; a < countOfMember; a++) {
					if (a==j||a==(j+1)) 
						System.out.printf("*");
					//i=0 X
					//i=1 mList[5]
					//i=2 mList[5] [4]
					//i=3 mList[5] [4] [3]
					if(i+a>5)
						System.out.printf("[");
					System.out.printf("%d,%5s,%s,%3d", mList[a].id, mList[a].uid, mList[a].name, mList[a].age);
					if(i+a>5)
						System.out.printf("]");
					System.out.println();
				}
				Thread.sleep(1000);
				
				if (mList[j].age > mList[j+1].age) {
					Member temp = mList[j];
					mList[j] = mList[j + 1];
					mList[j + 1] = temp;
					check = true;
				}
				//정렬 된 후 출력
				for (int a = 0; a < 50; a++) 
					System.out.println();
				for (int a = 0; a < countOfMember; a++) {
					if(i+a>5)
						System.out.printf("[");
					if (check&&a==j||check&&a==(j+1)) 
						System.out.printf("[");
					System.out.printf("%d,%5s,%s,%3d", mList[a].id, mList[a].uid, mList[a].name, mList[a].age);
					if (check&&a==j||check&&a==(j+1)) 
						System.out.printf("]");
					if(i+a>5)
						System.out.printf("]");
					System.out.println();
				}
				Thread.sleep(1000);
				
			}
		}
		System.out.println("작업완료");
	}
}