package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		int x;
		double ans;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		x = sc.nextInt();
		
		if (x <= 0) {
			ans = (x*x*x) -9*x + 2.0 ;
			System.out.println("계산결과는" + ans + "입니다");
		}
		else {
			ans = 7*x + 2.0 ;
			System.out.println("계산결과는" + ans + "입니다");
		}
		
		sc.close();

	}

}
