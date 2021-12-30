package ex02.io.printstream;
public class Program {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 40;
		kor3 = 30;

		total = kor1 + kor2 + kor3;
		avg = total / 3;
		
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n", avg);
		
		System.out.print("┌─────────────────────────────┐");
		System.out.print("│           성적 출력                        │");
		System.out.print("└─────────────────────────────┘");
		
		System.out.print("국어1 : 0");
		System.out.print("국어2 : 0");
		System.out.print("국어3 : 0");
		System.out.print("총점 : 0");
		System.out.print("평균 : 0.00");
		
		
		
	}
}