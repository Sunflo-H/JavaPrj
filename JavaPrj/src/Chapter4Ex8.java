import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Chapter4Ex8 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res\\data3.txt");
		Scanner scan = new Scanner(fis);

		/*
		 * //���� ���� ��� �̿�
		 * 
		 * int[] nums1 = new int[] {1,2,3,4,5}; int[] nums2 = {6,7,8};
		 * 
		 * int[][] nums = new int[2][];//���� ��������°� ���� nums[0]=nums1; nums[1]=nums2;
		 * 
		 * nums[0][2] =40; //nums[0][2]�� ���� �ٲٴϱ� //nums1[2]�� ���� ���� �ٲ�� //������ ����� �� ������
		 * ����
		 */

		// ���̸� �ѹ��� �迭�� ���� //////���̸� �̿��� gs �迭 ũ�� ����
		/////////////////////// ������ �Է�
		int[] lengths = { 8, 5, 9 };// �� ���� ������ �������� ���̸� �˱⶧���� lengths��� 3�� ũ�⸦ ���� �迭�� �־�����ϴ�
		int[][] gs = new int[3][]; // 2���� �迭�� gs�� �����ϴµ�,�� 2���� �迭�� ���Ҵ� lengths�� ũ�� ó�� �� ���� ������ �ǹ��ϱ⶧���� �� 3��¥����
									// ��������ϴ�.
		for (int i = 0; i < lengths.length; i++) {// �� ���� ������ŭ i���� �������� �����͸� gs�� �������Դϴ�
			int cnt = lengths[i];
			gs[i] = new int[cnt];// gs[i][cnt] ��°ž� ���� ������ �ƴ��� ��ü ��������
		}

		for (int j = 0; j < gs.length; j++) {
			String line = scan.nextLine();
			String[] kors = line.split(",");
			for (int i = 0; i < kors.length; i++) {
				gs[j][i] = Integer.parseInt(kors[i]);
			}
		}

		scan.close();
		fis.close();
		////////////////////////////////////////////////////////// ����////////////////////////////////
		///// ���� 1�� �л��� ������������ ���� �� �����������ε� �����غ���

		for (int i = 0; i < gs.length; i++) { // ��� �� ���� ���
			int cnt = lengths[i];
			//�ڡڡڡڡڡڡڡڡڡڡڡڡ�
			for (int j = 0; j < cnt-1; j++) {// �� ���� �л� ����ŭ �ݺ�
				for (int s = 0; s < cnt - 1 - j; s++) { // ������ ���� Ƚ���� �پ��鼭 �Ѵ�
					if (gs[i][s] < gs[i][s + 1]) {
						int tmp = gs[i][s];
						gs[i][s] = gs[i][s + 1];
						gs[i][s + 1] = tmp;
					}
				}
			}
		}
		// ������������ �����ϰ�(������ ����) �� ���� 1���� �������� ������������ �� �����ϱ�
		// ������ �ϱ� ���ؼ��� �� ũ��� ũ��-1��ŭ �ݺ��ؾ��Ѵ�.
		for (int j = 0; j < gs.length-1; j++) // gs��� 2���� �迭�� ���α��� = ���� ���� ��ŭ �ݺ����ϱ���
			for (int i = 0; i < gs.length - 1-j; i++) {// �� �ȿ��� ���� ����-1��ŭ ������������ ������ �߽��ϴ�.
				if (gs[i][0] < gs[i + 1][0]) {// �̶� ���� �񱳴� �� ���� 1���� ���� �� �ֵ��� gs[i][0]�� gs[i+1][0]�� ���߽��ϴ�.
					int[] temp = gs[i];
					gs[i] = gs[i + 1];
					gs[i + 1] = temp; // �̷��� ������ ��µǰ� ����ڵ� ����
				}
			}

		///// ���

//		for(int i=0;i<gs.length;i++) {
//			lengths[i]=gs[i].length;
//		}
		for (int j = 0; j < gs.length; j++) {
			int size = gs[j].length;

			for (int i = 0; i < size; i++) {
				System.out.printf("%d", gs[j][i]);
				if (i < size - 1)
					System.out.printf(",");
			}

			System.out.println();
		}

		////////////// �Լ�/////////////////////
//		int[][] fgs = new int[3][];
//		inputData(fgs);
//		sortData(fgs);
//		outputData(fgs);
	}

	static int[][] inputData(int[][] fgs) throws IOException {
		FileInputStream fis = new FileInputStream("res\\data3.txt");
		Scanner scan = new Scanner(fis);
		int i = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] kors = line.split(",");
			for (int j = 0; j < kors.length; j++)
				fgs[i][j] = Integer.parseInt(kors[j]);// �ݺ�
			i++;
		}
		scan.close();
		fis.close();
		return fgs;
	}

	static int[][] sortData(int[][] fgs) {
//		for(int i=0;)

		return fgs;
	}

	static void outputData(int[][] fgs) {
		System.out.println("================�Լ����================");
		for (int i = 0; i < fgs.length; i++) {
			for (int j = 0; j < fgs[i].length; j++) {
				if (j == 0)
					System.out.printf("%d�� ���� : ", i + 1);
				System.out.printf("%d ", fgs[i][j]);
			}
			System.out.println();
		}
	}
}