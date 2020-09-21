package Practics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import chapter6ex3.NumList;

public class Program4 {

   public static void main(String[] args) throws IOException {
      
      NumList list = new NumList();
      
      list.size = 0;
      list.nums = null;
      
      // 데이터를 int[] nums 배열에 로드하는 코드를 작성하고
      load(list);
      
      while(true) {
         // 사용자로부터 숫자 하나를 입력 받는다.
         Scanner scan = new Scanner(System.in);
         System.out.print("숫자입력>");
         int num = scan.nextInt();
         
         add(list, num);
         
         // nums 배열의 합계를 구하고
         int sum = sum(list); 
         
         System.out.println(sum);
         
         // nums 값 중에서 짝수의 개수를 구하고
         int count = getEvenNumberCount(list);
         
         System.out.println(count);
      }
       ///////
      
   }

   private static void add(NumList list, int num) {
      
      //공간이 모자라면 공간을 늘려주는 작업
      // 1. list.nums.length 보다 5개 큰 배열 temp 를 준비한다.
      //list.nums.length;
      //list.size
	   						//9
      int[] temp = new int[list.size+5]; //한명이 추가 될때마다 방을 옮기는게 잘못
      
      // 2. 현재 list.nums배열에 있는 값들을 temp공간에 옮긴다.
      for(int i=0; i<list.size; i++)
         temp[i] = list.nums[i];
      
      
      // 3. temp가 참조하는 배열을 list.nums에 참조시킨다.
      list.nums = temp;
      
      list.nums[list.size] = num;
      //여기가 nums[9]니까 추가되는 숫자가 계속 9번째 자리지
      list.size++;
      System.out.println(Arrays.toString(list.nums));
      
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