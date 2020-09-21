package chapter6ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Chapter4Ex2Sum {

	public static void main(String[] args) throws IOException {
		// 데이터를 int[] nums 배열에 로드하는 코드를 작성하고
		int[] nums = load();

		// nums 배열의 합계를 구하고
		int total = sum(nums);

		// nums 값 중에서 짝수의 개수를 구하고
		int count = getEvenNumberCount(nums);

		// nums 값 중에서 짝수의 합을 구하고
		int evenTotal = getEvenNumberSum(nums);
		
		// nums 값중 1번째와 7번째 값을 바꾸고 출력하라
		swap_x_y(nums); 
		
		// nums 값을 오름차순으로 바꾸고 출력하라
		sort_ascending(nums);
		
		// nums 값을 result.txt 파일에 저장하라
		save(nums);
		///////

	}
	
	static int size() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("res\\data.txt");
		Scanner scan = new Scanner(fis,"UTF-8");
		int size = scan.nextInt();

		return size;
	}

	static int[] load() throws IOException {
		FileInputStream fis = new FileInputStream("res\\data.txt");
		Scanner scan = new Scanner(fis,"UTF-8");

		// 배열의 크기 -> 파일의 헤더에 등록된 데이터 수를 가져온다.
		int size = scan.nextInt();

		int[] nums = new int[size];

		// 배열에 데이터를 읽어(로드)온다.
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}

		fis.close();

		return nums;
	}

	static int sum(int[] nums) throws FileNotFoundException {
		int sum = 0;
		for (int i = 0; i < size(); i++)
			sum += nums[i];
		return sum;
	}

	static int getEvenNumberCount(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] % 2 == 0)
				count++;
		return count;
	}

	static int getEvenNumberSum(int[] nums) {
		int EvneNumberSum = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] % 2 == 0)
				EvneNumberSum += nums[i];

		return EvneNumberSum;
	}

	static void swap_x_y(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[6];
		nums[6] = temp;
		
		System.out.println("1번째 6번째 값 바꾸기");
		for(int i=0;i<nums.length;i++)
			System.out.printf("%d ",nums[i]);
		System.out.println();
		System.out.println("====================================");
	}

	static void sort_ascending(int[] nums) {
		for (int j = 0; j < 9 - 1; j++) {
			for (int i = 0; i < 9 - 1 - j; i++) {
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
		System.out.println("오름차순 정렬");
		for(int i=0;i<nums.length;i++)
			System.out.printf("%d ",nums[i]);
		System.out.println();
		System.out.println("====================================");
	}
	
	static void save(int[] nums) throws IOException {
		FileOutputStream fos = new FileOutputStream("res\\result.txt");
		///////////////////////////PrintStream 사용///////////////////////////////////
		PrintStream out = new PrintStream(fos, true,"UTF-8");
		
		for(int i=0;i<nums.length;i++)
			out.print(nums[i]+" ");
		out.flush();
		//////////////////////////FileWrite 사용
//		FileWriter fw= new FileWriter("res\\result.txt");
//		//문자기반 스트림이라서 이상한값 저장되는거구나 
//		for(int i=0;i<nums.length;i++)
//			fw.write(nums[i]);
//		fw.flush();
		fos.flush();
	}

}