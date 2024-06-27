package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int first, second;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자 2개를 입력하세요");
		System.out.print("숫자1: ");
		first = sc.nextInt();
		System.out.print("숫자2: ");
		second = sc.nextInt();
		
		if (first > second) {
			if ( first%second == 0) {
				System.out.print(second + "는(은)" + first + "약수 입니다");
			}
			else {
				System.out.print(second + "는(은)" + first + "약수가 아닙니다");
			}
		}
		else {
			if (second%first == 0) {
				System.out.print(first + "는(은)" + second + "약수 입니다");
			}
			else {
				System.out.print(first + "는(은)" + second + "약수가 아닙니다");
			}
		}
		
		sc.close();

	}

}
