package report;

import java.util.Scanner;

public class adas {
public static void main(String[] args) {
   
   

Scanner scanner = new Scanner(System.in);

   System.out.println("=======�ｺŬ�� ȸ������ ���α׷�=======");
   System.out.println("1.ȸ�� �������� | 2.���α׷� ����");
   System.out.println("============================");
   System.out.println("�޴��� �����ϼ���. >>>");
   int n = scanner.nextInt();
   int member = scanner.nextInt();
   String[] mberId = new String[member]; 
   String[] mberNm = new String[member]; 
   String[] mberAr = new String[member]; 
	   
   
   if(n == 1) {
      System.out.println("===========�Ϲ�ȸ�� ��������===========");
      System.out.println("11.�Ϲ�ȸ�� �����Է� | 22.�Ϲ�ȸ�� �������� | 33.�Ϲ�ȸ�� ����Ȯ�� | 0.�����ܰ� ");
      System.out.println("==================================");
      System.out.println("�޴��� �����ϼ���. >>>");
      
      int menu = scanner.nextInt();
      
      while(true) {
      if(menu == 11) {
         System.out.println("������ ȸ�� ���� �Է��ϼ���.>>>");   
      
      
      
      
      
      System.out.println("ȸ�������� �Է��ϼ���.>>>");
      
         for(int i = 0; i < member; i++) { 
         
              System.out.println("ȸ�� ���̵�");
              mberId[i] = scanner.next(); 
              
              System.out.println("ȸ�� �̸�");
              mberNm[i] = scanner.next();
              
              System.out.println("ȸ�� ����");
              mberAr[i] = scanner.next(); 
  
         }
        
			
		}
          
         System.out.println("===========�Ϲ�ȸ�� ��������===========");
         System.out.println("11.�Ϲ�ȸ�� �����Է� | 22.�Ϲ�ȸ�� �������� | 33.�Ϲ�ȸ�� ����Ȯ�� | 0.�����ܰ� ");
         System.out.println("==================================");
         System.out.println("�޴��� �����ϼ���. >>>");
         
         int menu2 = scanner.nextInt();
         if(menu2 == 33) {
            System.out.println("��ϵ� ȸ�� ���� "+ member+"�Դϴ�.");
           
            for(int i = 0; i < mberId.length; i++) {
               System.out.println("ȸ����ȣ"+(i+1));
               System.out.println("ȸ�� ���̵�"+mberId[i]);
               System.out.println("ȸ�� �̸�"+mberNm[i]);
               System.out.println("ȸ�� ����"+mberAr[i]);
            }
         }
      }
   }
}}
         
           
			
   
      
         
      
      

   
