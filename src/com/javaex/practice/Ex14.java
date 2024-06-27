package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int numb, team;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력하세요");
		System.out.print("사번: ");
		numb = sc.nextInt();
		team = numb%3;
			
		if (team == 0) {
			System.out.print("A팁 입니다");
		}
		else if (team == 1) {
			System.out.print("B팁 입니다");
		}
		else {
			System.out.print("C팁 입니다");
		}
			
			
		sc.close();

	}

}
