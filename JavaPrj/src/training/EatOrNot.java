package training;

import java.io.IOException;
import java.util.Random;

public class EatOrNot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Random rand = new Random();

		System.out.println("�������� ������?! enter��������");
		System.in.read();
		
		if(rand.nextInt(2)==0)
			System.out.println("�;ƾ� �Ծ��~!~!");
		else
			System.out.println("������ ��.��");
		
		System.in.read();
	}

}
