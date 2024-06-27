package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int first, second;
		char oper;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String userInput = sc.next();
		oper =  userInput.charAt(0);
		
		System.out.print("숫자1: ");
		first = sc.nextInt();
		System.out.print("숫자2: ");
		second = sc.nextInt();
		
		switch (oper) {
			case '+':
				System.out.print("결과는: " + (((double) first) + second));
				break;
			case '-':
				System.out.print("결과는: " + (((double) first) - second));
				break;
			case '*':
				System.out.print("결과는: " + (((double) first) * second));
				break;
			case '/':
				if (second == 0) {
					System.out.print("계산 할수 없습니다");
				}
				else {
					System.out.print("결과는: " + (((double) first) * second));
				}
				break;
			default:
				System.out.print("계산을 할수 없는 기호입니다");
				break;
		}
		sc.close();
	}

}
