package chapter7ex1;

import java.util.Random;

public class Program {

   public static void main(String[] args) {
      
      /*
       * 1. �˸��� : ���� ������ �׸�(��������� �׸�)-��ƼƼ:��ü
       * 2. ���� : �˸��̵��� ������ �ִ��� ����������..�ؼ� �˸��̵��� �������ִ� ����
       * 3. ������ : ������� �Է�/����� �����ִ� ����� ������ӽ�
       */
      
      // �˸���
      int[] lotto = new int[6];
     
      
      //��ȣ�� ���� gen
      Random rand = new Random();
      for(int i=0; i<6; i++)
         lotto[i] = rand.nextInt(45)+1;
      
      // ��ȣ�� ��� print
      for(int i=0; i<6; i++)
         System.out.printf("%d ", lotto[i]);
      
      System.out.println();   
      
      
      // ��ȣ�� ���� sort
      for(int j=0; j<5; j++)
         for(int i=0; i<5-j; i++) 
            if(lotto[i] > lotto[i+1]) {
               int temp = lotto[i];
               lotto[i] = lotto[i+1];
               lotto[i+1] = temp;
            }
         
            
      
      // ��ȣ�� ��� print
      for(int i=0; i<6; i++)
         System.out.printf("%d ", lotto[i]);
      
      System.out.println();
      
      
   }

}