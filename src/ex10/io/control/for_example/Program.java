package ex10.io.control.for_example;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int total = 0;
		int total2 = 0;
		
		// 1~10까지 합
		for(int i=0; i<10; i++) {
			total += i+1;
		}
		System.out.printf("1~10까지의 합: %d\n", total);
		
		// 3~7까지 합
		/*
		for(int i=0; i<5; i++) {
			total2 += 3+i;
		}
		*/
		
		total2 = 5*(3+7)/2;
		
		System.out.printf("3~7까지의 합: %d\n", total2);
		
	}
}