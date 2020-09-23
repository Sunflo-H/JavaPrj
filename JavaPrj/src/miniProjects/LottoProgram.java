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
			Console.clear();

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
				Lotto.autoMake(lotto);
				break;
			case 2:
				Lotto.manualMake(lotto);
				break;
			case 3:
				Lotto.load(lotto);
				break;
			case 4:
				System.out.println("\t\tLotto 관리 프로그램을 종료합니다.");
				break EXIT;

			default:
				System.out.println("\t\t잘못된 메뉴를 눌렀습니다 다시 눌러주세요");
				Console.pause();
				break;
			}
		}
		scan.close();
	}
	
}
