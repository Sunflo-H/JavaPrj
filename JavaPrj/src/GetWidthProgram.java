import java.io.FileInputStream;
import java.io.IOException;

public class GetWidthProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Work\\Workspace\\img1.bmp");

		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();

		/*
		 * for (int i = 0; i < 18; i++) { fis.read(); }
		 */

		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();

		// [b1][b2][b3][b4] => file size
		int width = (b4 & 0xff) << 24 | (b3 & 0xff) << 16 | (b2 & 0xff) << 8 | (b1 & 0xff);
		System.out.printf("file width is %d\n", width);

		int b5 = fis.read();
		int b6 = fis.read();
		int b7 = fis.read();
		int b8 = fis.read();

		int height = (b8 & 0xff) << 24 | (b7 & 0xff) << 16 | (b6 & 0xff) << 8 | (b5 & 0xff);
		System.out.printf("file width is %d\n", height);

	}

}