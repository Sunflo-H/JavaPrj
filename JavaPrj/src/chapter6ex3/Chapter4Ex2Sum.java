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
		// �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
		int[] nums = load();

		// nums �迭�� �հ踦 ���ϰ�
		int total = sum(nums);

		// nums �� �߿��� ¦���� ������ ���ϰ�
		int count = getEvenNumberCount(nums);

		// nums �� �߿��� ¦���� ���� ���ϰ�
		int evenTotal = getEvenNumberSum(nums);
		
		// nums ���� 1��°�� 7��° ���� �ٲٰ� ����϶�
		swap_x_y(nums); 
		
		// nums ���� ������������ �ٲٰ� ����϶�
		sort_ascending(nums);
		
		// nums ���� result.txt ���Ͽ� �����϶�
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

		// �迭�� ũ�� -> ������ ����� ��ϵ� ������ ���� �����´�.
		int size = scan.nextInt();

		int[] nums = new int[size];

		// �迭�� �����͸� �о�(�ε�)�´�.
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
		
		System.out.println("1��° 6��° �� �ٲٱ�");
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
		System.out.println("�������� ����");
		for(int i=0;i<nums.length;i++)
			System.out.printf("%d ",nums[i]);
		System.out.println();
		System.out.println("====================================");
	}
	
	static void save(int[] nums) throws IOException {
		FileOutputStream fos = new FileOutputStream("res\\result.txt");
		///////////////////////////PrintStream ���///////////////////////////////////
		PrintStream out = new PrintStream(fos, true,"UTF-8");
		
		for(int i=0;i<nums.length;i++)
			out.print(nums[i]+" ");
		out.flush();
		//////////////////////////FileWrite ���
//		FileWriter fw= new FileWriter("res\\result.txt");
//		//���ڱ�� ��Ʈ���̶� �̻��Ѱ� ����Ǵ°ű��� 
//		for(int i=0;i<nums.length;i++)
//			fw.write(nums[i]);
//		fw.flush();
		fos.flush();
	}

}