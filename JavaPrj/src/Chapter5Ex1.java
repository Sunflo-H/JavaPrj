import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter5Ex1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res\\data4.txt");
		Scanner scan = new Scanner(fis, "UTF-8");

		// 로드
		int count = 0;
		int length = 10;
		int[] ids = new int[length];
		String[] names = new String[length];
		int[] kors = new int[length];

		{
			int i=0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				ids[i] = Integer.parseInt(tokens[0]);
				names[i] = tokens[1];
				kors[i] = Integer.parseInt(tokens[2]);
				i++;
			}
			count=i;
		}

		scan.close();
		fis.close();
		// 바꾸기
		// 저장
		System.out.println(count);
		for (int i = 0; i < count; i++)
			System.out.printf("id : %d, name : %s, kor : %d\n", ids[i], names[i], kors[i]);

	}
}