package chapter7ex2;

import java.util.Random;

public class LottoService {
	int[] nums;

	//초기화 함수 -> 생성자 -> constructor
	LottoService() {
		this.nums=new int[6];
	}

	void gen() {
		Random rand = new Random();
		for (int i = 0; i < 6; i++)
			this.nums[i] = rand.nextInt(45) + 1;
		System.out.println();
	}


	void sort() {
		for (int j = 0; j < 5; j++)
			for (int i = 0; i < 5 - j; i++)
				if (this.nums[i] > this.nums[i + 1]) {
					int temp = this.nums[i];
					this.nums[i] = this.nums[i + 1];
					this.nums[i + 1] = temp;
				}
	}


	void print() {
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", this.nums[i]);

		System.out.println();
	}

}