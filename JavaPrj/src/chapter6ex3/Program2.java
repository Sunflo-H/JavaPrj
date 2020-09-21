package chapter6ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/*
 * 과제 1 : 
 * load() 함수에서 로드한 데이터의 개수를
 * main 함수가 알게 하라.... 
 */

public class Program2 {
   
   public static void main(String[] args) throws IOException {
   
      // 데이터를 int[] nums 배열에 로드하는 코드를 작성하고
      int size = 0;
      int[] nums = new int[10];
      //size를 전역변수(기본형변수)로 잡으니까 값이 이상해 ->Program3으로
            
      load(nums, size);
      
      // nums 배열의 합계를 구하고
      printSum(nums, size);
      
      // nums 값 중에서 짝수의 개수를 구하고
      printEvenNumberCount(nums, size);      
         
       ///////
      
   }

   static void printEvenNumberCount(int[] nums, int size) {
      
      //int size = nums.length;
      
      int count = 0;      
      for(int i=0; i<size; i++)
         if(nums[i]%2 == 0)
            count++;
      
      System.out.println(count);   
   }

   static void printSum(int[] nums, int size) {
      
      //int size = nums.length;
      
      int sum = 0;
      for(int i=0; i<size; i++)
         sum += nums[i];
      
      System.out.println(sum);
   }

   static int[] load(int[] nums, int size) throws IOException {
      
      FileInputStream fis = new FileInputStream("res/data.txt");      
      Scanner scan = new Scanner(fis);      
      
      // 어?? 이상한데? 뭔가 비효율적인데?
      //int size = scan.nextInt();
      //int[] nums = new int[size];
      size =scan.nextInt();
      
      // 배열에 데이터를 읽어(로드)온다.
      for(int i=0; i<size; i++) {
         nums[i] = scan.nextInt();
      }
      
      fis.close();
      
      return nums;
   }

}