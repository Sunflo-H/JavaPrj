package miniProjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		Lotto lotto = new Lotto();

		EXIT: while (true) {
			
			for (int i = 0; i < 100; i++)
				System.out.println();
			
			System.out.println("\t\tLotto 관리 프로그램");
			System.out.println();
			System.out.println("\t\t1.번호 자동 생성");
			System.out.println("\t\t2.번호 수동 생성");
			System.out.println("\t\t3.내 로또 번호 보기");
			System.out.println("\t\t4.종료");
			System.out.print("\t\t>");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				autoMake(lotto);
				break;
			case 2:
				manualMake(lotto);
				break;
			case 3:
				load(lotto);
				break;
			case 4:
				System.out.println("Lotto 관리 프로그램을 종료합니다.");
				break EXIT;

			default:
				System.out.println("잘못된 메뉴를 눌렀습니다 다시 눌러주세요");
				break;
			}
		}
	}

	

	static void autoMake(Lotto lotto) throws IOException {// 인덱스와 값을 포함해서 따로 저
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++)
			System.out.println();
		
		System.out.println("\t\t1.Lotto 번호 자동 생성");
		System.out.println();
		System.out.println("\t\t생성할 개수  ");
		System.out.print("\t\t>");
		int count = scan.nextInt();
		lotto.nums = new int[count][lotto.size];

		for (int i = 0; i < 100; i++)
			System.out.println();

		System.out.println("\t\t1.Lotto 번호 자동 생성");
		System.out.println();
		System.out.println("\t인덱스\t\t로또 번호");
		for (int i = 0; i < count; i++) {
			System.out.printf("\t%3d\t  ", i + 1);
			for (int j = 0; j < lotto.size; j++) {
				lotto.nums[i][j] = rand.nextInt(45) + 1;
				System.out.printf("%d ", lotto.nums[i][j]);
			}
			System.out.println();
		}
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
		default:
			System.out.println("잘못된 메뉴를 눌렀습니다 다시 눌러주세요");
			break;
		}

	}

	static void manualMake(Lotto lotto) {
		
		for (int i = 0; i < 100; i++)
			System.out.println();
		
		System.out.println("\t\t2. Lotto 번호 수동 생성");
		System.out.println();
		System.out.println("\t\t번호를 입력하세요(예 6 7 12 20 40 45) ");
		System.out.println("\t\t(단, 그만 입력하려면 -1을 입력하세요)");
		System.out.print("\t\t>");
		int num = 0;
		int i = 0;
		while (num != -1) {
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();

			for (int j = 0; j < lotto.size; j++) {
				if (num == -1)
					break;
				lotto.nums[i][j] = num;
			}
			i++;
			System.out.println();
		}
	}
	
	static void load(Lotto lotto) throws IOException {
		FileInputStream fis = new FileInputStream("res\\Lotto.txt");
		
		for (int i = 0; i < 100; i++)
			System.out.println();
		
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
				System.out.printf("%d ", Integer.parseInt(tokens[j]));
			}
			System.out.println();
			count++;
		}
		fis.close();

	}

	static void save(Lotto lotto) throws IOException {
		FileOutputStream fos = new FileOutputStream("res\\Lotto.txt", true);
		PrintStream out = new PrintStream(fos, true, "utf-8");
		for (int i = 0; i < lotto.nums.length; i++) {
			for (int j = 0; j < lotto.size; j++)
				out.printf("%d ", lotto.nums[i][j]);
			out.printf("\n");
		}
		fos.close();
	}

//	static void overlapCheck(Lotto lotto) {
//		Random rand= new Random();
//		for(int i=0;i<lotto.nums.length;i++) {
//			for(int j=0;j<lotto.size;j++) {
//				for(int k=0;k<lotto.size;k++) {
//					if(lotto.nums[i][j]==lotto.nums[i][k])
//						if(lotto.nums[i][j]!=rand.nextInt(45)+1)
//							lotto.nums[i][j]=rand.nextInt(45)+1;
//						else
//							lotto.nums[i][j]=rand.nextInt(45)+1;
//				}
//			}
//		}
//	}
}
