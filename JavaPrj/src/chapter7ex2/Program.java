package chapter7ex2;

import java.util.Random;

public class Program {

	public static void main(String[] args) {

		// 1. �˸��� : ���� ������ �׸�(��������� �׸�)-��ƼƼ:��ü
		// 2. ���� : �˸��̵��� ������ �ִ��� ����������..�ؼ� �˸��̵����������ִ� ����
		// 3. ������ : ������� �Է�/����� �����ִ� ����� ������ӽ�

		// �˸���
		// int[] lotto = new int[6];
		Lotto lotto = new Lotto(); //������
		//������ ȣ��� ��ü�����ϰԲ� �������
		//Lotto.init(lotto);
		//lotto.init();

//		 ��ȣ�� ���� gen  ���ʷ�����(����)  -> Lotto.gen(lotto) -> Lotto.gen() ���� �ٲܼ� �ִ� �̰� ��ü������ �����ϴ� ��
		//Lotto.gen(lotto);  //static method ������ �޼���
		lotto.gen();	   //instance method
		
		//�Ѵ� �޼ҵ�� �޼ҵ��ε� 
		//lotto.gen�� �� �� ���׷��̵� �ȰŶ� ���� �޼ҵ�� �ϱ� ���׷� �ٸ� 
		//������ �޼���� �и��ϱ� �����ν��Ͻ� �޼���� �Ѵ�
		//�ν��Ͻ� �Լ��� ���� ����� �°� �������̴�
		//lotto.gen = �ζǸ� ����! lotto�� ��ü
		//Lotto.gen(lotto) = ������! �ζǸ�   ������ ��ü
		// ����� ��簡 ��ü���� ���ϴ�
		
		// �ζ� ��ȣ�� ��� print
		//Lotto.print(lotto);
		lotto.print();
		// ��ȣ�� ���� sort
		//Lotto.sort(lotto);
		lotto.sort();
		// ��ȣ�� ��� print
		//Lotto.print(lotto);
		lotto.print();

	}
	

}