package chapter5eEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/data5.txt");
	      Scanner scan = new Scanner(fis, "UTF-8");

	      //Member[] list = new Member[10];
	      Member[] m = new Member[6];
	      int count = 0;
	      {
	         int i=0; 
	         while(scan.hasNextLine()) {
	            String line = scan.nextLine();
	            String[] tokens = line.split(",");
	            m[i]=new Member();
	            m[i].id = Integer.parseInt(tokens[0]);
	            m[i].uid = tokens[1];
	            m[i].name = tokens[2];
	            m[i].age = Integer.parseInt(tokens[3]);

	            i++;
	         }
	         count = i;
	      }

	      // 로드 -----
	      
	      scan.close();
	      fis.close();
	      

	      // 출력 -----
	      for(int j=0;j<count;j++)
	    	  System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", m[j].id,m[j].uid,m[j].name,m[j].age);
	      
	    	
	      
	      System.out.println("작업완료");
	      
	      
	      
	      
	      
	      
	      

	}
}
