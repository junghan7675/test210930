package report;

import java.util.Scanner;

public class adas {
public static void main(String[] args) {
   
   

Scanner scanner = new Scanner(System.in);

   System.out.println("=======헬스클럽 회원관리 프로그램=======");
   System.out.println("1.회원 정보관리 | 2.프로그램 종료");
   System.out.println("============================");
   System.out.println("메뉴를 선택하세요. >>>");
   int n = scanner.nextInt();
   int member = scanner.nextInt();
   String[] mberId = new String[member]; 
   String[] mberNm = new String[member]; 
   String[] mberAr = new String[member]; 
	   
   
   if(n == 1) {
      System.out.println("===========일반회원 정보관리===========");
      System.out.println("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회원 정보확인 | 0.이전단계 ");
      System.out.println("==================================");
      System.out.println("메뉴를 선택하세요. >>>");
      
      int menu = scanner.nextInt();
      
      while(true) {
      if(menu == 11) {
         System.out.println("가입할 회원 수를 입력하세요.>>>");   
      
      
      
      
      
      System.out.println("회원정보를 입력하세요.>>>");
      
         for(int i = 0; i < member; i++) { 
         
              System.out.println("회원 아이디");
              mberId[i] = scanner.next(); 
              
              System.out.println("회원 이름");
              mberNm[i] = scanner.next();
              
              System.out.println("회원 지역");
              mberAr[i] = scanner.next(); 
  
         }
        
			
		}
          
         System.out.println("===========일반회원 정보관리===========");
         System.out.println("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회원 정보확인 | 0.이전단계 ");
         System.out.println("==================================");
         System.out.println("메뉴를 선택하세요. >>>");
         
         int menu2 = scanner.nextInt();
         if(menu2 == 33) {
            System.out.println("등록된 회원 수는 "+ member+"입니다.");
           
            for(int i = 0; i < mberId.length; i++) {
               System.out.println("회원번호"+(i+1));
               System.out.println("회원 아이디"+mberId[i]);
               System.out.println("회원 이름"+mberNm[i]);
               System.out.println("회원 지역"+mberAr[i]);
            }
         }
      }
   }
}}
         
           
			
   
      
         
      
      

   
