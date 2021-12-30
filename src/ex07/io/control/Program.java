package ex07.io.control;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		while(true)
		{
			//------ 성적 입력 부분 -----------------------------
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적 입력                    │");
			System.out.println("└───────────────────────────┘");
			
			System.out.print("국어1: " );
			kor1 = scan.nextInt();
			
			while(kor1 < 0 || kor1 > 100) {
				System.out.println("성적범위(0~100)를 벗어났습니다");
				System.out.print("국어1: " );
				kor1 = scan.nextInt();
			}
			
			System.out.print("국어2: " );
			kor2 = scan.nextInt();
			System.out.print("국어3: " );
			kor3 = scan.nextInt();
			
			//------ 성적 출력 부분 -----------------------------
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적 출력                    │");
			System.out.println("└───────────────────────────┘");
			total = kor1 + kor2 + kor3;
			//avg = (float)(total / 3.0);
			avg = total / 3.0f;
			
			// s String, c character, f float double d 정수
			System.out.printf("\t%s   : %3d\n", "국어1", kor1);
			System.out.printf("\t국어2 : %3d\n", kor2);
			System.out.printf("\t국어3 : %3d\n", kor3);
			System.out.printf("\t총점    : %3d\n", total);
			System.out.printf("\t평균    : %6.2f\n", avg);
			System.out.printf("--------------------------------");
		}
	}
}