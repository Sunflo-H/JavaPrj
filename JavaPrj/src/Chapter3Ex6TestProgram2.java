import java.io.IOException;

public class Chapter3Ex6TestProgram2 {

	public static void main(String[] args) throws IOException {

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++)
				if (i == 0)
					if (j == 0 || j == 11)
						System.out.print(' ');
					else
						System.out.print('¦¨');
				else if (i == 11)
					if (j == 0 || j == 11)
						System.out.print(' ');
					else
						System.out.print('¦ª');
				else {
					if (j == 0 || j == 11)
						if (i == 10)
							System.out.print(0);
						else
							System.out.print(i);
					else
						System.out.print('¦«');
				}

			System.out.println();
		}

	}

}
