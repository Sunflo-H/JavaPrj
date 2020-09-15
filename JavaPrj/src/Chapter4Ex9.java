import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter4Ex9 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res\\img1.cmp");
		Scanner scan = new Scanner(fis, "UTF-8");

		// img1.cmp의 문자를 좌우 바꾸기
		// 캐릭터 버퍼 [0]<->[18] 바꾸고 바꾸다보면 좌우 바뀐다

		// 로드

		String line = scan.nextLine();
		System.out.println(line);
		char[] arr = line.toCharArray();
		System.out.println(Arrays.toString(arr));

		// 바꾸기////////////////arr.length=19

		for (int j = 0; j < arr.length / 2; j++) {
			char temp = arr[j];
			arr[j] = arr[(arr.length - 1) - j];
			arr[(arr.length - 1) - j] = temp;
		}

		System.out.println(Arrays.toString(arr));

		// 저장
		FileOutputStream fos = new FileOutputStream("res\\img1-reverse.cmp");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		for (int i = 0; i < arr.length; i++) {
			osw.write(arr[i]);
		}
		osw.flush();
		//fos.close();
	}
}