package chapter6ex3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {

   public static void main(String[] args) throws IOException {
      
      NumList list = new NumList();
      
      list.size = 0;
      list.nums = null;
      
      // �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
      load(list);
      
      // nums �迭�� �հ踦 ���ϰ�
      int sum = sum(list); 
      
      System.out.println(sum);
      
      // nums �� �߿��� ¦���� ������ ���ϰ�
      int count = getEvenNumberCount(list);
      
      System.out.println(count);   
       ///////
      
   }

   private static int getEvenNumberCount(NumList list) {
      
      int count = 0;      
      for(int i=0; i<list.size; i++)
         if(list.nums[i]%2 == 0)
            count++;
      
      return count;
   }

   static int sum(NumList list) {
      
      int sum = 0;
      for(int i=0; i<list.size; i++)
         sum += list.nums[i];
      
      return sum;
   }

   static void load(NumList list) throws IOException {
      
      FileInputStream fis = new FileInputStream("res/data.txt");      
      Scanner scan = new Scanner(fis);      
            
      list.size = scan.nextInt();
      list.nums = new int[list.size];
            
      for(int i=0; i<list.size; i++) {
         list.nums[i] = scan.nextInt();
      }
      
      fis.close();
   }

}