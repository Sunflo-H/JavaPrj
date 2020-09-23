package miniProjects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public int[][] nums;// 로또 번호
	public int size = 6;

	// 객체 배열 이용하면 nums를 일차배열로 만들수 있다.
//중복체크 필요
	public static void autoMake(Lotto lotto) throws IOException {// 인덱스와 값을 포함해서 따로 저
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		Console.clear();

		System.out.println("\t\t1.Lotto 번호 자동 생성");
		System.out.println();
		System.out.println("\t\t생성할 개수  ");
		System.out.print("\t\t>");
		int count = scan.nextInt();
		lotto.nums = new int[count][lotto.size];
		// 중복체크 하면서 랜덤값을 넣는다
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
							j--; // 이러케 해야 j갑 -1 줄고 다시 +1이된다
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
			System.out.println("\t\t1.Lotto 번호 자동 생성");
			System.out.println();
			System.out.println("\t인덱스\t\t로또 번호");

			outputLotto(lotto);

			int menu = subMenu(lotto); // 반복문 없음
			if (menu == 1 || menu == 2)
				break;
		}

	}

	/////////////////////////// 수동
	public static void manualMake(Lotto lotto) throws IOException {

		Console.clear();

		System.out.println("\t\t2. Lotto 번호 수동 생성");
		System.out.println();
		System.out.println("\t\t번호를 입력하세요(예 6 7 12 20 40 45)");
		System.out.println("\t\t(단, 그만 입력하려면 -1을 입력하세요)");
		Scanner scan = new Scanner(System.in);

		// scan을 nextInt()로 받음
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
				// 처음 lotto.nums.length =1
				if (lotto.nums.length == count) {// nums에 더이상 공간이 없으면
					int[][] temp = new int[lotto.nums.length + 1][lotto.size];

					// 현재 nums의 값을 temp로 옮긴다
					for (int i = 0; i < lotto.nums.length; i++)
						for (int j = 0; j < lotto.size; j++)
							temp[i][j] = lotto.nums[i][j];
					// temp가 참조하는 배열을 nums에 참조 시킨다
					lotto.nums = temp;
				} 
					 lotto.nums[count][a] = num;// 얘를 -1 아래에 둠으로써 해결

				// 중복체크
//				EXIT: for (int i = 0; i < lotto.nums.length; i++) {
//					for (int j = 0; j < lotto.size; j++) {
//
//						int k = 0;
//						if (j == 0)
//							lotto.nums[i][j] = num;
//						else {
//							while (j != k) {
//								if (lotto.nums.length >1&&lotto.nums[i][k] == num) {//중복이면
//									// 
//									//lotto.nums.length =1 이면 어떡하지?
//									//lotto.nums.length >1 이고
//									//만약 중복이면 값을 옮기고 배열삭제 후 새로참조
//
//									int[][] temp = new int[lotto.nums.length][lotto.size];
//
//									for (int ti = 0; ti < lotto.nums.length-1; ti++)
//										for (int tj = 0; tj < lotto.size; tj++)
//											temp[ti][tj] = lotto.nums[ti][tj];
//									// temp가 참조하는 배열을 nums에 참조 시킨다
//									lotto.nums = temp;
//									//System.out.println("중복된 값입니다");
//									Console.pause();
//									break EXIT;
//								} else {// 중복이 아니면 값을 넣어라
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
			System.out.println("\t\t2.Lotto 번호 수동 생성");
			System.out.println();
			System.out.println("\t인덱스\t\t로또 번호");

			outputLotto(lotto);

			int menu = subMenu(lotto); // 반복문 없음
			if (menu == 1 || menu == 2)
				break;
		}

	}

	public static void load(Lotto lotto) throws IOException {
		FileInputStream fis = new FileInputStream("res\\Lotto.txt");

		Console.clear();

		System.out.println();
		System.out.println("\t\t3.내 로또 번호 보기");
		System.out.println();
		System.out.println("\t인덱스\t\t로또 번호");

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
		System.out.println("\t\t저장되었습니다");
		Console.pause();
		fos.close();
	}

	static int subMenu(Lotto lotto) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("\t\t1.\t저장하기"); // 저장이 파일에 저장하는거니까 다음에 클래스에 오는 인덱스는 신경쓰지말고 또 로또 만들땐 덮어써
		System.out.println("\t\t2.\t상위메뉴로 가기 ");

		System.out.print("\t\t>");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			save(lotto);
			break;
		case 2:
			break;
		default: // 여기 제대로 안댐
			System.out.println("\t\t잘못된 메뉴를 눌렀습니다 다시 눌러주세요");
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
//	public static boolean intCheck(Lotto lotto, int count) { // 입력받은 수가 숫자가 아니라면
//	for (int i = 0; i < lotto.size; i++)
//		if (lotto.nums[count][i] < 1 && 45 < lotto.nums[count][i])
//			System.out.println("입력범위를 벗어났습니다(1~45) 다시 입력해주세요");
//
//	return true;
//}

}
//아웃풋 로또 count 매개변수 써야되나 고려해바
