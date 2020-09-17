package chapter5eEx2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import chapter5eEx2.Member;

public class Program6 {

   public static void main(String[] args) throws IOException, InterruptedException {

      FileInputStream fis = new FileInputStream("res/data5.txt");
      Scanner scan = new Scanner(fis, "UTF-8");

      //      회원(Member) 이수철회원;
      //      
      //      묶어서->그룹화->데이터형식
      //      구조화(=그룹화), 구조적인, 구조
      
      Member[] list = new Member[10];
      
      int count = 0;
      {
         int i=0;
         while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            
            // 사용자 형식
            // User Type
            // 개념상의 그룹핑명: 개체명
            // Member : 개체(Entity)명 <-> m : 객체(Object)명 
            Member m = new Member();
            m = new Member();
            
            m.id = Integer.parseInt(tokens[0]);
            m.uid = tokens[1];
            m.name = tokens[2];
            m.age = Integer.parseInt(tokens[3]);
            
            list[i] = m;
            
            i++;
         }
         count = i;
      }
      scan.close();
      fis.close();
      
      // 정렬... -----
      for(int j=0; j<count-1; j++) {
         for(int i=0; i<count-1-j; i++) {
            
            for(int a=0; a<100; a++)
               System.out.println();
            
            for(int a=0; a<count-j; a++) {                  
               Member m = list[a];
               
               if(a == i || a == i+1)
                  System.out.print("*");
               
               System.out.printf("%d,%s,%s,%d\n", 
                                       m.id,m.uid,m.name,m.age);
            }
            
            for(int a=0; a<j; a++) {                  
                Member m = list[a];
                                
                System.out.printf("[%d,%s,%s,%d]\n", 
                                        m.id,m.uid,m.name,m.age);
             }
            
            Thread.sleep(1000);
                        
            boolean changed = false;
            if(list[i].age > list[i+1].age) {
               Member temp = list[i];
               list[i] = list[i+1];
               list[i+1] = temp;
               changed = true;
            }
            
            for(int a=0; a<100; a++)
               System.out.println();
            
            
            
            
            
            
            
            
            for(int a=0; a<count-j; a++) {                  
               Member m = list[a];
               
               if(changed && (a==i || a == i+1))
                  System.out.print("->");
               
               System.out.printf("%d,%s,%s,%d\n",
                                       m.id,m.uid,m.name,m.age);               
               
            }
            
            for(int a=0; a<j; a++) {                  
                Member m = list[a];
                                
                System.out.printf("[%d,%s,%s,%d]\n", 
                                        m.id,m.uid,m.name,m.age);
             }
            
            Thread.sleep(1000);
            
         }                                                          
      }
      
      
      // 출력 -----
      
      System.out.println("작업완료");
   }

}