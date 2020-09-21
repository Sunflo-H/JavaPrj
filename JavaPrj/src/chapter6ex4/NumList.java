package chapter6ex4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NumList {
	public int size = 0;
	public int[] nums;
	public static void add(NumList list, int num) {

		// 공간이 모자라면 공간을 늘려주는 작업
		// 1. list.nums.length 보다 5개 큰 배열 temp 를 준비한다.
		// list.nums.length;
		// list.size
		// if(배열 공간의 수 == 데이터의 수 면 방을 바꾸지마)
		// ↑ 위 조건이 배열이 꽉 찬거야 배열의 길이가 데이터의 수와 같으니까

		// ★★
		if (list.nums.length <= list.size) {
			int[] temp = new int[list.size + 5]; // 한명이 추가 될때마다 방을 옮기는게 잘못

			// 2. 현재 list.nums배열에 있는 값들을 temp공간에 옮긴다.
			for (int i = 0; i < list.size; i++)
				temp[i] = list.nums[i];

			// 3. temp가 참조하는 배열을 list.nums에 참조시킨다.
			list.nums = temp;
		}

		list.nums[list.size] = num;
		// 여기가 nums[9]니까 추가되는 숫자가 계속 9번째 자리지
		list.size++;
		System.out.println(Arrays.toString(list.nums));

	}

	public static int getEvenNumberCount(NumList list) {

		int count = 0;
		for (int i = 0; i < list.size; i++)
			if (list.nums[i] % 2 == 0)
				count++;

		return count;
	}

	public static int sum(NumList list) {

		int sum = 0;
		for (int i = 0; i < list.size; i++)
			sum += list.nums[i];

		return sum;
	}

	public static void load(NumList list) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		list.size = scan.nextInt();
		list.nums = new int[list.size];

		for (int i = 0; i < list.size; i++) {
			list.nums[i] = scan.nextInt();
		}
		fis.close();
	}

}
