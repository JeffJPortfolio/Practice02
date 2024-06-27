package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		double height, weight ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무개를 입력해주세요");
		System.out.print("키: ");
		height = sc.nextDouble();
		System.out.print("몸무게: ");
		weight = sc.nextDouble();
		
		double avg = (height - 100) * 0.9 ;
		
		if (weight < avg) {
			System.out.print("저체중 입니다");
		}
		else if (weight > avg) {
			System.out.print("과체중 입니다");
		}
		else {
			System.out.print("표준 입니다");
		}
		System.out.print("표준체중: " + avg);
		sc.close();
	}

}
