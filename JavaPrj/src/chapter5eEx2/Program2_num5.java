package chapter5eEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program2_num5 {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("res/data5.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

		// �ε� -----
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
		

		// ���̼����� ��������

		for (int j = 0; j < count-1; j++) {// �����6�̴ϱ� ������ -1��ŭ �ݺ��Ѵ�
			for (int i = 0; i < count - 1 - j; i++) {
				boolean sort_check = false;
				for (int a = 0; a < 50; a++)
					System.out.println();

				/////////////////////////////// �ٲ�� ��
				/////////////////////////////// ���/////////////////////////////////////////////////
				System.out.println("[�ٲ�� ��]");
				// �ٲ�� �� ���
				for (int a = 0; a < count; a++) {
					Member m = list[a];
					if (a == i || a == (i + 1))
						System.out.print("*");
					
					if(a>count-1-j||j==count-1-1)// j = 1 �ѹ� �ݺ��������� [a=5]  j=2 [a=5][a=4]  j=3 [a=5][a=4][a=3]   j=4  [5][4][3][2]   j=5 [5][4][3][2][1]
						//j�� 4���� ���̾� 5���ɼ� ���� �׷��� j==4�� ���� [a]�鵵 ��ȣ�� ���Բ� j==4�϶��� ��ȣ�ϰ� �����
						//a+j=6, a+j=7,6 a+j=8,7,6  ���� a+j>5 �Ǵ°��� �ٵ� 5= count-1�̶� ����
						System.out.printf("[");
					System.out.printf("id:%d, uid:%5s, name:%s, age:%3d", m.id, m.uid, m.name, m.age);
					
					if(a>count-1-j||j==count-1-1)
						System.out.printf("]");
					
					System.out.println();
				}

				Thread.sleep(500);

				//////////////////////////////// ������������///////////////////////////////////////////////
				if (list[i].age > list[i + 1].age) {
					Member temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					sort_check = true;
				}

				//////////////////////////////// �ٲ� �� ���////////////////////////////////////////
				for (int a = 0; a < 50; a++)
					System.out.println();

				///////////// ������ �������� ���[]�� ���
				System.out.println("[�ٲ� ��]");

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

		// ��� -----
//		System.out.println("[�������]");
//		for (int j = 0; j < count; j++)
//			System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[j].id, list[j].uid, list[j].name, list[j].age);

		System.out.println("�۾��Ϸ�");

	}
}
