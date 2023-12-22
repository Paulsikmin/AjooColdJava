package org.ajoo.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		// 모델 방식
		char grade = 0;
		if(score < 101) {
			if(score >= 90) 
				grade = 'A';
			else if(score >= 80) 
				grade = 'B';
			else if(score >= 70)
				grade = 'C';
			else if(score >= 60)
				grade = 'D';
			else
				grade = 'F';
		}else {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요.");
		}
		System.out.println("학점은 "+grade+"입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		// 100 ~ 90 : A
		// 89 ~ 80 : B
		// 79 ~ 70 : C
		// 69 ~ 60 : D
		// 60미만 : F
		// 학점은 F입니다.
	}
}
