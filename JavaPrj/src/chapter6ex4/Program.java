package chapter6ex4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/*
 * ���� 1 : 
 * load() �Լ����� �ε��� �������� ������
 * main �Լ��� �˰� �϶�.... 
 */

public class Program {
   
   public static void main(String[] args) throws IOException {
   
      // �����͸� int[] nums �迭�� �ε��ϴ� �ڵ带 �ۼ��ϰ�
      int[] nums = load();
      
      // nums �迭�� �հ踦 ���ϰ�
      printSum(nums);
      
      // nums �� �߿��� ¦���� ������ ���ϰ�
      printEvenNumberCount(nums);      
         
       ///////
      
   }

   static void printEvenNumberCount(int[] nums) {
      
      int size = nums.length;
      
      int count = 0;      
      for(int i=0; i<size; i++)
         if(nums[i]%2 == 0)
            count++;
      
      System.out.println(count);   
   }

   static void printSum(int[] nums) {
      
      int size = nums.length;
      
      int sum = 0;
      for(int i=0; i<size; i++)
         sum += nums[i];
      
      System.out.println(sum);
   }

   static int[] load() throws IOException {
      
      FileInputStream fis = new FileInputStream("res/data.txt");      
      Scanner scan = new Scanner(fis);      
      
      // ��?? �̻��ѵ�? ���� ��ȿ�����ε�?
      int size = scan.nextInt();
      int[] nums = new int[size];
      
      
      // �迭�� �����͸� �о�(�ε�)�´�.
      for(int i=0; i<size; i++) {
         nums[i] = scan.nextInt();
      }
      
      fis.close();
      
      return nums;
   }

}