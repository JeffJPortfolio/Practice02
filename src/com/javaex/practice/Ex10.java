package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int first, second;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자 2개를 입력하세요");
		System.out.print("숫자1: ");
		first = sc.nextInt();
		System.out.print("숫자2: ");
		second = sc.nextInt();
		
		if (first > second) {
			first = second ;
		}
		
		System.out.print("가장 작은수는 "+ first + "입니다");
		
		sc.close();

	}

}
