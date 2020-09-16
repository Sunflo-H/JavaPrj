package chapter5eEx2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		Member m1 = new Member();
		m1.id =1;
		m1.uid ="soo";
		m1.name="이수철";
		m1.age =29;
		
		System.out.println(m1.id);
		System.out.println(m1.uid);
		System.out.println(m1.name);
		System.out.println(m1.age);
		
		int a=10;
		System.out.println("for문 영역");
		for(int i =0;i<2;i++){
		  System.out.println("i = "+i);
		  System.out.println("a = "+a);
		}
		System.out.println("main 영역");
		System.out.println("a = "+a);
		//System.out.println("i = "+i);
		
		FileInputStream fis = new FileInputStream("res/data5.txt");
	      Scanner scan = new Scanner(fis, "UTF-8");
//	      int[] ids = new int[10];
//	      String[] uids = new String[10];
//	      String[] names = new String[10];
//	      int[] ages = new int[10];
//	      
//	      int i=0; 
//	      while(scan.hasNextLine()) {
//	         String line = scan.nextLine();
//	         String[] tokens = line.split(",");
//	         
//	         ids[i] = Integer.parseInt(tokens[0]);
//	         uids[i] = tokens[1];
//	         names[i] = tokens[2];
//	         ages[i] = Integer.parseInt(tokens[3]);
//	         
//	         i++;
//	      }

	      Member[] list = new Member[10];
          
	      int count = 0;
	      {
	         int i=0; 
	         while(scan.hasNextLine()) {
	            String line = scan.nextLine();
	            String[] tokens = line.split(",");
	            
	            Member m = new Member();
	            
	            m.id = Integer.parseInt(tokens[0]);
	            m.uid = tokens[1];
	            m.name = tokens[2];
	            m.age = Integer.parseInt(tokens[3]);
	            
	            list[i] = m;
	            
	            i++;
	         }
	         count = i;
	      }

	      // 로드 -----
	      
	      scan.close();
	      fis.close();
	      

	      // 출력 ----- 나이기준 오름차순
	      for(int j=0;j<count;j++)
	    	  System.out.printf("id:%d, uid:%5s, name:%s, age:%3d\n", list[j].id,list[j].uid,list[j].name,list[j].age);
	      
	      System.out.println("작업완료");
	      
	      
	      
	      
	      
	      
	      

	}
}
