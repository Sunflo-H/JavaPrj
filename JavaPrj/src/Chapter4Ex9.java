import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter4Ex9 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res\\img1.cmp");
		Scanner scan = new Scanner(fis, "UTF-8");

		// img1.cmp
		// ĳ [0]<->[18]


		//입력
		String line = scan.nextLine();
		System.out.println(line);
		char[] arr = line.toCharArray();
		System.out.println(Arrays.toString(arr));

		// ////////////////arr.length=19

		//역정렬
		for (int j = 0; j < arr.length / 2; j++) {
			char temp = arr[j];
			arr[j] = arr[(arr.length - 1) - j];
			arr[(arr.length - 1) - j] = temp;
		}

		System.out.println(Arrays.toString(arr));

		//출력
		FileOutputStream fos = new FileOutputStream("res\\img1-reverse.cmp");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
//		PrintStream out = new PrintStream(fos, true, "UTF-8");
		FileWriter fw = new FileWriter("res\\img1-reverse.cmp");
		for (int i = 0; i < arr.length; i++) {
			//osw.write(arr[i]);
//			out.print(arr[i]);
//			out.print(",");
			fw.write(arr[i]);
		}
		fw.flush();
		//osw.write(cbuf);
		//osw.flush();
		//fos.close();
	}
}