package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		char oper;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String userInput = sc.next();
		oper =  userInput.charAt(0);
		
		
		switch (oper) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print("모음입니다");
				break;
			default:
				System.out.print("자읍입니다");
				break;
		}
		sc.close();

	}

}
