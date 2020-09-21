package chapter6ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/*
 * ���� 1 : 
 * load() �Լ����� �ε��� �������� ������
 * main �Լ��� �˰� �϶�.... 
 */

public class Program3 {
   
   public static void main(String[] args) throws IOException {
   
      // �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
      //int size = 0;
      //int[] nums = new int[10];
            
	  NumList list = new NumList();
	  list.size = 0;
	  list.nums = null;
      load(list);
      
      // nums �迭�� �հ踦 ���ϰ�
      printSum(list);
      
      // nums �� �߿��� ¦���� ������ ���ϰ�
      printEvenNumberCount(list);      
         
       ///////
      
   }

   static void printEvenNumberCount(NumList list) {
      
      //int size = nums.length;
      
      int count = 0;      
      for(int i=0; i<list.size; i++)
         if(list.nums[i]%2 == 0)
            count++;
      
      System.out.println(count);   
   }

   static void printSum(NumList list) {
      
      //int size = nums.length;
      
      int sum = 0;
      for(int i=0; i<list.size; i++)
         sum += list.nums[i];
      
      System.out.println(sum);
   }

   static int[] load(NumList list) throws IOException {
      
      FileInputStream fis = new FileInputStream("res/data.txt");      
      Scanner scan = new Scanner(fis);      
      
      // ��?? �̻��ѵ�? ���� ��ȿ�����ε�?
      //int size = scan.nextInt();
      //int[] nums = new int[size];
      list.size =scan.nextInt();
      int size = list.size;
      list.nums = new int[size];
      int[] nums = list.nums;
      
      // �迭�� �����͸� �о�(�ε�)�´�.
      for(int i=0; i<size; i++) {
         nums[i] = scan.nextInt();
      }
      
      fis.close();
      
      return nums;
   }

}