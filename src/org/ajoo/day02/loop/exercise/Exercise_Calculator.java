package org.ajoo.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
//		for(;;) {}
		while(true) { // 무한반복
			System.out.print("정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char operator = sc.next().charAt(0);
			int result = 0;
			switch(operator) {
				case '+' : result = num1 + num2; break;
				case '-' : result = num1 - num2; break;
				case '*' : result = num1 * num2; break;
				case '/' : result = num1 / num2; break;
				case '%' : result = num1 % num2; break;
			}
			System.out.printf("%d %c %d = %d\n", num1,operator,num2,result);
		}
//		if(operator == '+') {
//			result = num1 + num2;
//		}
	}
}
















