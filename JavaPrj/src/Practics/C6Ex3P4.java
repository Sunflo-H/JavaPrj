package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import chapter6ex3.NumList;

public class C6Ex3P4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		NumList list = new NumList();
		load(list);

		EXIT: while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<메뉴>>");
			System.out.println("1.값추가");
			System.out.println("2.총합을 출력");
			System.out.println("3.짝수의 수를 출력");
			System.out.println("4.종료");
			System.out.println("메뉴를 입력하세요 : ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("추가할 값을 입력하세요 : ");
				int num = scan.nextInt();
				add(list, num);
				break;
			case 2:
				printSum(list);
				break;
			case 3:
				printEvenNumber(list);
				break;
			case 4:
				System.out.println("Bye~~");
				break EXIT;

			}
		}

	}

	public static void load(NumList list) throws IOException {
		FileInputStream fis = new FileInputStream("res\\data.txt");
		Scanner scan = new Scanner(fis);
		list.size = scan.nextInt();

		list.nums = new int[list.size];
		for (int i = 0; i < list.size; i++) {
			list.nums[i] = scan.nextInt();
		}
		fis.close();
	}

	public static void printSum(NumList list) {
		int sum = 0;
		for (int i = 0; i < list.size; i++) {
			sum += list.nums[i];
		}
		System.out.println(sum);
	}

	public static void printEvenNumber(NumList list) {
		int count = 0;
		for (int i = 0; i < list.size; i++) {
			if (list.nums[i] % 2 == 0)
				count++;
		}
		System.out.println(count);
	}

	public static void add(NumList list, int num) {

		if (list.size == list.nums.length) {
			int[] temp = new int[list.size + 5];

			for (int i = 0; i < list.size; i++)
				temp[i] = list.nums[i];

			list.nums = temp;
		}
		list.nums[list.size] = num;
		list.size++;

		System.out.println(Arrays.toString(list.nums));
	}

}
