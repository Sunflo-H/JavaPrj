import java.io.FileInputStream;
import java.io.IOException;

public class FileReadProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Work\\Workspace\\img1.bmp");

		fis.read();
		fis.read();

		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();

		// [b1][b2][b3][b4] => file size
		int size = (b4 & 0xff) << 24 | (b3 & 0xff) << 16 | (b2 & 0xff) << 8 | (b1 & 0xff);
		System.out.printf("file size is %d\n", size);
		
		
		
	}

}