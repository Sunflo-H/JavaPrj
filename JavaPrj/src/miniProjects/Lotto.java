package miniProjects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public int[][] nums;// �ζ� ��ȣ
	public int size = 6;

	// ��ü �迭 �̿��ϸ� nums�� �����迭�� ����� �ִ�.
//�ߺ�üũ �ʿ�
	public static void autoMake(Lotto lotto) throws IOException {// �ε����� ���� �����ؼ� ���� ��
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		Console.clear();

		System.out.println("\t\t1.Lotto ��ȣ �ڵ� ����");
		System.out.println();
		System.out.println("\t\t������ ����  ");
		System.out.print("\t\t>");
		int count = scan.nextInt();
		lotto.nums = new int[count][lotto.size];
		// �ߺ�üũ �ϸ鼭 �������� �ִ´�
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < lotto.size; j++) {
				// lotto.nums[0][0]=10;
				// lotto.nums[0][1]=20;
				// lotto.nums[0][2]=30;
				// lotto.nums[0][3]=40;
				int k = 0;
				int num = rand.nextInt(45) + 1;// 20//30//30
				if (j == 0)
					lotto.nums[i][j] = num;
				else {
					while (j != k) {
						if (lotto.nums[i][k] == num) {
							j--; // �̷��� �ؾ� j�� -1 �ٰ� �ٽ� +1�̵ȴ�
							break;
						} else {
							lotto.nums[i][j] = num;
							k++;
						}
					}
				}
			}
		}
		while (true) {
			Console.clear();
			System.out.println("\t\t1.Lotto ��ȣ �ڵ� ����");
			System.out.println();
			System.out.println("\t�ε���\t\t�ζ� ��ȣ");

			outputLotto(lotto);

			int menu = subMenu(lotto); // �ݺ��� ����
			if (menu == 1 || menu == 2)
				break;
		}

	}

	/////////////////////////// ����
	public static void manualMake(Lotto lotto) throws IOException {

		Console.clear();

		System.out.println("\t\t2. Lotto ��ȣ ���� ����");
		System.out.println();
		System.out.println("\t\t��ȣ�� �Է��ϼ���(�� 6 7 12 20 40 45)");
		System.out.println("\t\t(��, �׸� �Է��Ϸ��� -1�� �Է��ϼ���)");
		Scanner scan = new Scanner(System.in);

		// scan�� nextInt()�� ����
		boolean check = false;
		int num = 0;
		int count = 0; // 0 1 2 3 4 5/ 6 7 8 9 10 11/ 12 13 14 15 16 17
		// lotto.nums2= new int[6];
		lotto.nums = new int[1][lotto.size];

		while (true) {
			System.out.print("\t\t>");
			int a = 0;
			while (true) {
				num = scan.nextInt();
				if (num == -1)
					break;
				// ó�� lotto.nums.length =1
				if (lotto.nums.length == count) {// nums�� ���̻� ������ ������
					int[][] temp = new int[lotto.nums.length + 1][lotto.size];

					// ���� nums�� ���� temp�� �ű��
					for (int i = 0; i < lotto.nums.length; i++)
						for (int j = 0; j < lotto.size; j++)
							temp[i][j] = lotto.nums[i][j];
					// temp�� �����ϴ� �迭�� nums�� ���� ��Ų��
					lotto.nums = temp;
				} 
					 lotto.nums[count][a] = num;// �긦 -1 �Ʒ��� �����ν� �ذ�

				// �ߺ�üũ
//				EXIT: for (int i = 0; i < lotto.nums.length; i++) {
//					for (int j = 0; j < lotto.size; j++) {
//
//						int k = 0;
//						if (j == 0)
//							lotto.nums[i][j] = num;
//						else {
//							while (j != k) {
//								if (lotto.nums.length >1&&lotto.nums[i][k] == num) {//�ߺ��̸�
//									// 
//									//lotto.nums.length =1 �̸� �����?
//									//lotto.nums.length >1 �̰�
//									//���� �ߺ��̸� ���� �ű�� �迭���� �� ��������
//
//									int[][] temp = new int[lotto.nums.length][lotto.size];
//
//									for (int ti = 0; ti < lotto.nums.length-1; ti++)
//										for (int tj = 0; tj < lotto.size; tj++)
//											temp[ti][tj] = lotto.nums[ti][tj];
//									// temp�� �����ϴ� �迭�� nums�� ���� ��Ų��
//									lotto.nums = temp;
//									//System.out.println("�ߺ��� ���Դϴ�");
//									Console.pause();
//									break EXIT;
//								} else {// �ߺ��� �ƴϸ� ���� �־��
//									lotto.nums[i][j] = num;
//									k++;
//								}
//							}
//						}
//					}
//				}

				if ((a + 1) % 6 == 0)
					break;
				a++;
			}
			if (num == -1)
				break;
			else
				count++;
		}
		while (true) {
			Console.clear();
			System.out.println("\t\t2.Lotto ��ȣ ���� ����");
			System.out.println();
			System.out.println("\t�ε���\t\t�ζ� ��ȣ");

			outputLotto(lotto);

			int menu = subMenu(lotto); // �ݺ��� ����
			if (menu == 1 || menu == 2)
				break;
		}

	}

	public static void load(Lotto lotto) throws IOException {
		FileInputStream fis = new FileInputStream("res\\Lotto.txt");

		Console.clear();

		System.out.println();
		System.out.println("\t\t3.�� �ζ� ��ȣ ����");
		System.out.println();
		System.out.println("\t�ε���\t\t�ζ� ��ȣ");

		Scanner scan = new Scanner(fis);
		int count = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] tokens = line.split(" ");

			System.out.printf("\t%3d\t  ", count + 1);
			for (int j = 0; j < lotto.size; j++) {
				System.out.printf("%2d ", Integer.parseInt(tokens[j]));
			}
			System.out.println();
			count++;
		}
		Console.pause();

		fis.close();
	}

	public static void save(Lotto lotto) throws IOException {
		FileOutputStream fos = new FileOutputStream("res\\Lotto.txt", true);
		PrintStream out = new PrintStream(fos, true, "utf-8");
		sort_ascending(lotto);
		for (int i = 0; i < lotto.nums.length; i++) {
			for (int j = 0; j < lotto.size; j++)
				out.printf("%d ", lotto.nums[i][j]);
			out.printf("\n");
		}
		System.out.println("\t\t����Ǿ����ϴ�");
		Console.pause();
		fos.close();
	}

	static int subMenu(Lotto lotto) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("\t\t1.\t�����ϱ�"); // ������ ���Ͽ� �����ϴ°Ŵϱ� ������ Ŭ������ ���� �ε����� �Ű澲������ �� �ζ� ���鶩 �����
		System.out.println("\t\t2.\t�����޴��� ���� ");

		System.out.print("\t\t>");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			save(lotto);
			break;
		case 2:
			break;
		default: // ���� ����� �ȴ�
			System.out.println("\t\t�߸��� �޴��� �������ϴ� �ٽ� �����ּ���");
			Console.pause();
			break;
		}

		return menu;
	}

	static void outputLotto(Lotto lotto) {
		sort_ascending(lotto);
		for (int i = 0; i < lotto.nums.length; i++) {
			System.out.printf("\t%3d\t  ", i + 1);
			for (int j = 0; j < lotto.size; j++) {
				System.out.printf("%2d ", lotto.nums[i][j]);
			}
			System.out.println();
		}
	}

//	public static void clear() {
//		for (int i = 0; i < 50; i++)
//			System.out.println();
//	}

	static void sort_ascending(Lotto lotto) {
		for (int k = 0; k < lotto.nums.length; k++) {
			for (int i = 0; i < lotto.size - 1; i++) {
				for (int j = 0; j < lotto.size - 1 - i; j++) {
					if (lotto.nums[k][j] > lotto.nums[k][j + 1]) {
						int temp = lotto.nums[k][j];
						lotto.nums[k][j] = lotto.nums[k][j + 1];
						lotto.nums[k][j + 1] = temp;
					}
				}
			}
		}
	}
//	public static boolean intCheck(Lotto lotto, int count) { // �Է¹��� ���� ���ڰ� �ƴ϶��
//	for (int i = 0; i < lotto.size; i++)
//		if (lotto.nums[count][i] < 1 && 45 < lotto.nums[count][i])
//			System.out.println("�Է¹����� ������ϴ�(1~45) �ٽ� �Է����ּ���");
//
//	return true;
//}

}
//�ƿ�ǲ �ζ� count �Ű����� ��ߵǳ� ����ع�
