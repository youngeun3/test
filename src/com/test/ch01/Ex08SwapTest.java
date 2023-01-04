package com.test.ch01;

public class Ex08SwapTest {
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		int c = 70;
		System.out.printf("a의 값은 %d이고 b의 값은 %d이고 c의 값은 %d입니다.%n%n", a, b, c, args);
		
		int tmp = a;
		a = b;
		b = c;
		c = tmp;
		System.out.printf("a의 값은 %d이고 b의 값은 %d이고 c의 값은 %d입니다.", a, b, c, args);
	}
}

/*
문제 1.
int a = 50;
int b = 30;
int c = 70;
swap알고리즘을 사용하여 세 변수의 값을 바꿔 주세요. 
*/