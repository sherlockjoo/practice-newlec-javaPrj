package ex15.marray;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kors = new int[3*3];
		int total;
		float avg;
		int menu;
		
		//과목 초기화
		for(int j=0; j<3; j++)
			for(int i=0; i<3; i++)
				kors[3*j+i] = 0;
		
		Scanner scan = new Scanner(System.in);
		
		종료:
		while(true) {
		
			System.out.println("┌────────────────────┐");
			System.out.println("│      메뉴 선택                │");
			System.out.println("└────────────────────┘");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택> ");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				
				System.out.println("┌────────────────────┐");
				System.out.println("│      성적 입력                │");
				System.out.println("└────────────────────┘");
				
				for(int j=0; j<3; j++) {
					for(int i=0; i<3; i++) {
						do {
							System.out.printf("%d학년 국어%d: ", j+1, i+1);
							kors[3*j+i] = scan.nextInt();
							
							if(kors[3*j+i] < 0 || kors[3*j+i] > 100)
								System.out.println("0~100까지의 숫자를 입력하세요.");
						
						} while(kors[3*j+i] < 0 || kors[3*j+i] > 100);
					}
				}
				break;
				
			case 2:
				
				System.out.println("┌────────────────────┐");
				System.out.println("│      성적 출력                │");
				System.out.println("└────────────────────┘");
				
				for(int j=0; j<3; j++) {					
					
					total = kors[3*j+0] + kors[3*j+1] + kors[3*j+2];
					avg = total / 3.0f;
					
					System.out.printf("%d학년 ────────────────\n", j+1);
					
					for(int i=0; i<3; i++) {
						System.out.printf("국어%d: %d\n", i+1, kors[3*j+i]);
					}
					System.out.printf("총점: %d\n", total);
					System.out.printf("평균: %f\n", avg);
					System.out.println("──────────────────────\n");
				}
				break;
			case 3:
				break 종료;	
			default:
				System.out.println("1~3번 중에서 선택하세요.");
			}
		}
		System.out.println("bye~");
	}
}
