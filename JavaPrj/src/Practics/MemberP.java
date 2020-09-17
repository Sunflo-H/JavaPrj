package Practics;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import chapter5eEx2.Member;

public class MemberP {

	public static void main(String[] args) throws IOException {

		// 연습문제 : data5.txt 파일을 읽어서 멤버에 값을 넣고 나이를 기준으로 많은 사람부터 출력하라 그리고 그 결과를
		// data5_p.txt에 출력하라
		// 조건 : 1. count 를 사용하여 출력할것 2. 인덱스에는 i와j 같은 변수만 사용할 것
		FileInputStream fis = new FileInputStream("res\\data5.txt");
		Scanner scan = new Scanner(fis);

		// 데이터 입력
		int count = 0;
		Member[] mList = new Member[10];
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
				
				mList[i]=m;
				i++;
				
			}
			count=i;
		}
		scan.close();
		fis.close();

		// 파일 출력
		
		FileOutputStream fos =new FileOutputStream("res\\data5_p.txt");
		PrintStream out = new PrintStream(fos,true,"utf-8");
		for(int i=0; i<count;i++) {
			Member m = mList[i];
			out.print(m.id+","+m.uid+","+m.name+","+m.age);
			System.out.println(m.id+","+m.uid+","+m.name+","+m.age);
		}
		
	}

}
