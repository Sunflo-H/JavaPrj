package chapter7ex1;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {

		// 1. �˸��� : ���� ������ �׸�(��������� �׸�)-��ƼƼ:��ü
		// 2. ���� : �˸��̵��� ������ �ִ��� ����������..�ؼ� �˸��̵����������ִ� ����
		// 3. ������ : ������� �Է�/����� �����ִ� ����� ������ӽ�

		// �˸���
		// int[] lotto = new int[6];
		Lotto lotto = new Lotto();
		Lotto.init(lotto);

//		 ��ȣ�� ���� gen  ���ʷ�����(����)  -> Lotto.gen(lotto) -> Lotto.gen() ���� �ٲܼ� �ִ� �̰� ��ü������ �����ϴ� ��
		Lotto.gen(lotto);
		// ��ȣ�� ��� print
		Lotto.print(lotto);
		// ��ȣ�� ���� sort
		Lotto.sort(lotto);
		// ��ȣ�� ��� print
		Lotto.print(lotto);

	}
	

}