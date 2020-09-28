package chapter7ex4.oop1.copy;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int turnOmokColor = 0;
		int x, y;

		OmokBoard omokBoard = new OmokBoard();
		OmokBowl blackBowl = new OmokBowl();
		OmokBowl whiteBowl = new OmokBowl();
		blackBowl.setOmokColor(0);
		whiteBowl.setOmokColor(1);
		StatusBoard statusBoard = new StatusBoard();
		statusBoard.setMyOmokColor(0);
		statusBoard.setTurnOmokColor(turnOmokColor);
		Scanner scan = new Scanner(System.in);

		while (true) {
			statusBoard.setTurnOmokColor(turnOmokColor);

			// �ʱ� ȭ�� ���
			omokBoard.print();
			statusBoard.print();
			blackBowl.print();
			whiteBowl.print();

			System.out.println();

			System.out.print("(x sp y)>");
			String line = scan.nextLine();
			String[] tokens = line.split(" ");
			x = Integer.parseInt(tokens[0])-1;
			y = Integer.parseInt(tokens[1])-1;

			// ���� ���ʿ� �ش�Ǵ� �׸����� �޶�� �Ѵ�.
			Omok omok;
			if (turnOmokColor == 0)
				omok = blackBowl.next();// ī��Ʈ�� 1�� �پ��� �Լ�
			else
				omok = whiteBowl.next();

			omok.setX(x);
			omok.setY(y);
			omok.setColor(turnOmokColor);

			// 010101 -> 0=1-0
			omokBoard.put(omok);
			if (statusBoard.getTurnOmokColor() == 0)
				turnOmokColor = 1;
			else
				turnOmokColor = 0;

			for (int i = 0; i < 50; i++)
				System.out.println();
		}

	}

}
