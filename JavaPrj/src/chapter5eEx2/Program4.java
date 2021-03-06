package chapter5eEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("res\\data5.txt");
		Scanner scan = new Scanner(fis);
		// 로드 -----
		Member[] list = new Member[10];
		int count = 0;
		int size = 6;
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
		// 나이순으로 내림차순 //추가문제 정렬 되기 전에 정렬할 것들을 표시 -> 정렬결과출력(이때는 표시없음) -> 반복

		
		
		for(int i=0;i<size-1;i++) {//사이즈가6이니까 정렬은 -1만큼 반복한다
			for(int j=0;j<size-1-i;j++) {
				for(int a=0;a<count;a++)
					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[a].id,list[a].uid,list[a].name,list[a].age);
			     
				
				if(list[j].age>list[j+1].age) {
					Member temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
				Thread.sleep(1000);
				for(int a=0; a<50;a++)
					System.out.println();
				
				//정렬된 값들을 출력한다.			
				for(int a=0;a<count;a++)
					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[a].id,list[a].uid,list[a].name,list[a].age);
			     
				Thread.sleep(1000);
			}
		}
		
		for(int a=0; a<50;a++)
			System.out.println();

		// 출력 ----- 나이기준 내림차순
		for (int i = 0; i < count; i++)
			System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[i].id, list[i].uid, list[i].name, list[i].age);

		System.out.println("작업완료");

	}
}
