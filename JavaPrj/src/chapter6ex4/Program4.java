package chapter6ex4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {

		NumList list = new NumList();

		list.size = 0;
		list.nums = null;

		// �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
		load(list);

		EXIT: while (true) {
			for (int i = 0; i < 50; i++)
				System.out.println();
			System.out.println("<<�޴�>>");
			System.out.println("1.���߰�");
			System.out.println("2.������ ���");
			System.out.println("3.¦���� ���� ���");
			System.out.println("4.����");
			// ����ڷκ��� ���� �ϳ��� �Է� �޴´�.
			Scanner scan = new Scanner(System.in);
			System.out.print("�޴��Է� (1~4): ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				scan = new Scanner(System.in);
				System.out.print("�����Է�>");

				int num = scan.nextInt();
				add(list, num);
				break;
			case 2:
				// nums �迭�� �հ踦 ���ϰ�
				int sum = sum(list);
				System.out.println("���� : " + sum);
				break;
			case 3:
				// nums �� �߿��� ¦���� ������ ���ϰ�
				int count = getEvenNumberCount(list);
				System.out.println("¦���� �� : " + count);
				break;
			case 4:
				System.out.println("Bye~~");
				break EXIT;
			default:
				System.out.println("������ ������ϴ�. �ٽ� �Է����ּ���");
				break;
			}
			// pause();
			System.in.read();
		}

		///////

	}

	private static void add(NumList list, int num) {

		// ������ ���ڶ�� ������ �÷��ִ� �۾�
		// 1. list.nums.length ���� 5�� ū �迭 temp �� �غ��Ѵ�.
		// list.nums.length;
		// list.size
		// if(�迭 ������ �� == �������� �� �� ���� �ٲ�����)
		// �� �� ������ �迭�� �� ���ž� �迭�� ���̰� �������� ���� �����ϱ�

		// �ڡ�
		if (list.nums.length <= list.size) {
			int[] temp = new int[list.size + 5]; // �Ѹ��� �߰� �ɶ����� ���� �ű�°� �߸�

			// 2. ���� list.nums�迭�� �ִ� ������ temp������ �ű��.
			for (int i = 0; i < list.size; i++)
				temp[i] = list.nums[i];

			// 3. temp�� �����ϴ� �迭�� list.nums�� ������Ų��.
			list.nums = temp;
		}

		list.nums[list.size] = num;
		// ���Ⱑ nums[9]�ϱ� �߰��Ǵ� ���ڰ� ��� 9��° �ڸ���
		list.size++;
		System.out.println(Arrays.toString(list.nums));

	}

	private static int getEvenNumberCount(NumList list) {

		int count = 0;
		for (int i = 0; i < list.size; i++)
			if (list.nums[i] % 2 == 0)
				count++;

		return count;
	}

	static int sum(NumList list) {

		int sum = 0;
		for (int i = 0; i < list.size; i++)
			sum += list.nums[i];

		return sum;
	}

	static void load(NumList list) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		list.size = scan.nextInt();
		list.nums = new int[list.size];

		for (int i = 0; i < list.size; i++) {
			list.nums[i] = scan.nextInt();
		}
		fis.close();
	}

	public static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}
}
