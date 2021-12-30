package ex11.io.control.elseif;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		while(true)
		{
			//------ 메인 메뉴 부분 -----------------------------
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           메인 메뉴                    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.종료");
			System.out.print("선택> ");
			menu = scan.nextInt();
			
			if(menu == 1) {
				//------ 성적 입력 부분 -----------------------------
				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적 입력                    │");
				System.out.println("└───────────────────────────┘");

				do {
					System.out.print("국어1: " );
					kor1 = scan.nextInt();
					
					if(kor1 < 0 || kor1 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다");
					
				}while(kor1 < 0 || kor1 > 100);
				
				
				do {
					System.out.print("국어2: " );
					kor2 = scan.nextInt();
					
					if(kor2 < 0 || kor2 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다");
					
				}while(kor2 < 0 || kor2 > 100);
				
				do {
					System.out.print("국어3: " );
					kor3 = scan.nextInt();
					
					if(kor3 < 0 || kor3 > 100)
						System.out.println("성적범위(0~100)를 벗어났습니다");
					
				}while(kor3 < 0 || kor3 > 100);
				
			} else if(menu == 2) {
				//------ 성적 출력 부분 -----------------------------
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				
				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적 출력                    │");
				System.out.println("└───────────────────────────┘");
				
				for(int i=0; i<3; i++) {
					System.out.printf("국어%d: %3d\n", i+1, kor1);
				}
				
				System.out.printf("\t총점    : %3d\n", total);
				System.out.printf("\t평균    : %6.2f\n", avg);
				System.out.printf("--------------------------------\n");
				
			} else if(menu == 3) {
				break;
			} else {
				System.out.println("1~3까지만 입력가능합니다.");
			}
		}
		
		System.out.println("bye");
	}
}