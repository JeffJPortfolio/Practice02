package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int first, second;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("첫번째 숫자: ");
		first = sc.nextInt();
		System.out.print("두번째 숫자: ");
		second = sc.nextInt();
		
		int order = first - second ;
		
		if (order > 0) {
			System.out.println("몫:" + (first / second));
			System.out.println("나머지:" + (first % second));
		}
		else {
			System.out.println("몫:" + (second/first));
			System.out.println("나머지:" + (second%first));
		}
		
		sc.close();


	}

}
