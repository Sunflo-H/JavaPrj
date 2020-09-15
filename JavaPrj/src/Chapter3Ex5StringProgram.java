import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter3Ex5StringProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data.txt");
		Scanner scan = new Scanner(fis);

		String word = scan.next();
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();

		System.out.println(word);
		System.out.println(line1);
		System.out.println(line2);

		fis.close();

	}

}
