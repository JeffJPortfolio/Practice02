package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		int earn;
		double ans = 0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("수입을 입력해 주세요");
		System.out.print("금익: ");
		earn = sc.nextInt();
		
		if (earn < 0) {
			System.out.println("잘못 입력했습니다");
		}
		else {
			if (earn >= 0 && earn <= 1000) {
				ans = 0.09* earn;
			}
			else if (earn > 1000 && earn <= 4000){
				ans = 1000*0.09 + 0.18*(earn-1000);
			}
			else if (earn > 4000 && earn < 8000){
				ans = 1000*0.09 + 3000*0.18 + 0.27*(earn-4000);
			}
			else if (earn >= 8000){
				ans = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(earn-8000);
			}
			System.out.println("소득세는 " + ans + " 입니다");
		}	
		
		sc.close();


	}

}
