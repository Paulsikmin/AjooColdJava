package org.ajoo.day01.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하시오!
		// 1 ~ 100 사이의 숫자를 입력하세요 : 32
		// 1부터 100사이의 숫자인가? true
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 숫자를 입력하세요 : ");
		int inVal = sc.nextInt();
		//boolean result = 1 < inVal < 100;
//		boolean bigger = inVal > 100;
//		boolean smaller = inVal <= 100;
		boolean result = (1 <= inVal) && (inVal <= 100);
		System.out.println("1부터 100사이의 숫자인가? " + result);
	}
}
