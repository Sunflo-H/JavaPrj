import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter3Ex2FileCopy {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Work\\Workspace\\img1.bmp");
		FileOutputStream fos = new FileOutputStream("C:\\\\Work\\\\Workspace\\\\img1-copy.bmp");

		while (true) {

			int b = fis.read();
			// 만약에 b = -1이면
			// 끝내기(1. while을 벗어나게 하는 방법 / 2. 프로세스 강제 정료)
			if (b == -1)
				break;

			fos.write(b);

		}
		
		//리소스를 닫는 함수. 반!드!시! 이것을 써주고 코드를 작성 할 것.
		fos.close();

	}

}