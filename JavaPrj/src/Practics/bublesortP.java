package Practics;

public class bublesortP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr = { 10, 3, 5, 7, 8, 4, 2 };
		int countOfNum = 7;
		// ��������

		for (int j = 0; j < countOfNum-1; j++) {//���ؾ��ϴ� ������ ������ŭ �ݺ�
			// 1ȸ�� ���� �� �Ÿ� 6�� ->1��~6����� ���ϸ� 7���� �ڵ����� ������ ->2��for��
			for (int i = 0; i < countOfNum - 1-j; i++) {//������ ������ ������ŭ �ݺ�
				// j=0 ����7��->6���ݺ� ���� i�� 6�� �ݺ�
				// j=1 ����6��->5���ݺ� ���� i�� 5�� �ݺ�
				// j=2 ����5��->4���ݺ� ���� i�� 4�� �ݺ�
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
