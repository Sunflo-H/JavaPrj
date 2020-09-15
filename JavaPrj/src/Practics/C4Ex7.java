package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class C4Ex7 {

	public static void main(String[] args) throws IOException {

		int clas = 3, stu = 9;
		int kor[][] = new int[clas][stu];

		/////////////////////// ������ �Է�
		FileInputStream fis = new FileInputStream("res//data2.txt");
		Scanner scan = new Scanner(fis);
		{
			int i = 0;
			while (scan.hasNextLine()) {
				String[] tokens = new String[stu];
				tokens = scan.nextLine().split(",");

				for (int j = 0; j < stu; j++) {
					kor[i][j] = Integer.parseInt(tokens[j]);
				}
				i++;
			}
		}
		scan.close();
		fis.close();
		//////////////////////// ������ ���
		int[] sums = new int[clas];
		double[] avgs = new double[clas];
		int total = 0;
		double total_avg = 0;
		
		//�� ���� ��
		for(int i=0;i<clas;i++) 
			for(int j=0;j<stu;j++)
				sums[i]+=kor[i][j]; //�� ���� ��
		
		//�� ���� ���
		for(int i=0;i<clas;i++)
			avgs[i]=(double)sums[i]/stu;
		
		//�� ����
		for(int i=0;i<clas;i++)
			total+=sums[i];
			
		//�� ���
		total_avg=(double)total/(clas*stu);
		
		//////////////////////// ������ ���
		for(int i=0;i<clas;i++)
			System.out.printf("[ %d�� ] ���� : %2d, ��� %6.2f\n",i+1,sums[i],avgs[i]);
		System.out.printf("[ ��ü ] ���� : %2d, ��� %6.2f\n",total,total_avg);

	}

}
