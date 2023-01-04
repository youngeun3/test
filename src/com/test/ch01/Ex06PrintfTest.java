package com.test.ch01;

public class Ex06PrintfTest {
	public static void main(String[] args) {
		int candy = 10;
		System.out.println("현재 사탕의 개수는 " + candy + "개 입니다.");
		System.out.println();
		
		int ch = 3;
		int y = 2;
		candy = candy -(ch+y);
		System.out.print("철수가 사탕을 " + ch + "개 샀고, ");
		System.out.println("영희가 사탕을 " + y + "개 샀습니다.");
		System.out.println("현재 사탕의 개수는 " + candy + "개 입니다.");;
		System.out.println();
		
		
		int d = 2;
		candy = candy +d;
		System.out.println("둘리가 사탕 " + d + "개를 환붏했습니다.");
		System.out.println("현재 사탕의 개수는 " + candy + "개 입니다.");
		System.out.println();
		
	}
}

/* 
문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 코드로 작성하세요. 
*/