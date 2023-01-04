package com.test.ch01;

import java.util.Scanner;

public class Ex07ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int candy;
		int ch;
		int y;
		int d;

		System.out.printf("슈퍼에 있는 사탕의 개수를 입력하세요.%n");
		candy = scan.nextInt();
		System.out.printf("철수가 산 사탕의 개수를 입력하세요.%n");
		ch = scan.nextInt();
		System.out.printf("영희가 산 사탕의 개수를 입력하세요.%n");
		y = scan.nextInt();
		System.out.printf("둘리가 환불한 사탕의 개수를 입력하세요.%n");
		d = scan.nextInt();
		
		System.out.printf("현재 사탕의 개수는 %d개입니다.%n%n", candy, args);

		System.out.printf("철수가 사탕 %d개를 샀습니다.%n", ch, args);
		System.out.printf("영희가 사탕 %d개를 샀습니다.%n", y, args);
		
		candy = candy -(ch+y);
		System.out.printf("현재 사탕의 개수는 %d개입니다.%n%n", candy, args);
		
		System.out.printf("둘리가 사탕%d개를 환불했습니다.%n", d, args);
		
		candy = candy + d;
		System.out.printf("현재 사탕의 개수는 %d개입니다.", candy, args);
	}
}

/* 
문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 scanner를 사용하여 작성하세요.
 
*/ 