package Practics;

public class bublesortP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr = { 10, 3, 5, 7, 8, 4, 2 };
		int countOfNum = 7;
		// 내림차순

		for (int j = 0; j < countOfNum-1; j++) {//비교해야하는 숫자의 개수만큼 반복
			// 1회차 정렬 이 거를 6번 ->1등~6등까지 구하면 7등은 자동으로 구해져 ->2중for문
			for (int i = 0; i < countOfNum - 1-j; i++) {//정렬할 숫자의 개수만큼 반복
				// j=0 숫자7개->6번반복 따라서 i도 6번 반복
				// j=1 숫자6개->5번반복 따라서 i도 5번 반복
				// j=2 숫자5개->4번반복 따라서 i도 4번 반복
				if (iArr[i] > iArr[i + 1]) {
					int temp = iArr[i];
					iArr[i] = iArr[i + 1];
					iArr[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < countOfNum; i++)
			System.out.printf("%d ", iArr[i]);

	}

}
