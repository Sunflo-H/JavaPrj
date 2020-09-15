import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter3Ex3CharProgram {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("res/data.txt");

		/*
		 * fos.write(3); fos.write(65); // -> 65 -> A fos.write('A' + 1); fos.write('A'
		 * + 2); fos.write('A' + 3); char c = 65;
		 * 
		 * fos.write(1); // 숫자 그대로(Binary)로 저장 fos.write('1'); // ASCII로 저장 1-> 47 //
		 * 127 -> '1', '2', '7'
		 * 
		 * fos.flush();
		 */

		int alphaSize = 'Z' - 'A' + 1;
		int i = 0;

		// 26번이 반복 (A부터 Z까지)

		while (i < alphaSize) {
			// 1. 특정 수 반복에는 인덱스가 있다. 그 값을 이용하라.
			// fos.write('A' + i);
			
			// 2. 1씩 증가되는 인덱스를 역순으로 사용할 수 있어야 한다.
			// fos.write('Z'-i);
			// fos.write('A'+alphaSize-i); //위와 같은 방식
			
			//3. 반복적 회귀형으로 출력하라 A~MA~M(단, if문 사용 금지)
			fos.write('A'+i%(alphaSize/2));
			
			i++;
		}

		fos.flush();

		fos.close();

		System.out.println("수행 완료");
	}

}