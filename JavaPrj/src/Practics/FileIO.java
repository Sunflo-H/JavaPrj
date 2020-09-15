package Practics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res\\datap.txt");
		Scanner scan = new Scanner(fis,"UTF-8"); //FileInputStream, OutputStream은 1byte씩 입출력한다.

		///입력
		String line= "";
		String[] line_arr = {};
		while(scan.hasNextLine()) {
			line=scan.nextLine();
		}
		System.out.println(line);
		
		char[] arr = line.toCharArray();
		System.out.println();
		System.out.println(Arrays.toString(arr));

		///1바이트 2바이트 분리
		
		///출력
		FileOutputStream fos = new FileOutputStream("res\\datap_kor.txt");
		PrintStream out = new PrintStream("res\\datap_kor.txt","UTF-8");
		for(int i=0;i<arr.length;i++)
			out.write(arr[i]);
		
		
	}
}
