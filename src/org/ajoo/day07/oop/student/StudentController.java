package org.ajoo.day07.oop.student;

import java.util.Scanner;

public class StudentController {
	Student [] students = new Student[3];
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	// 성적입력(이름, 점수1, 점수2)
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.print("이름 : ");
//			students[i].name = sc.next();
			String name = sc.next();
			students[i].setName(name);
			System.out.print("첫번째 점수 : ");
//			students[i].firstScore = sc.nextInt();
			int firstScore = sc.nextInt();
			students[i].setFirstScore(firstScore);
			System.out.print("두번째 점수 : ");
//			students[i].secondScore = sc.nextInt();
			students[i].setSecondScore(sc.nextInt());
		}
	}
	// 성적출력
	public void printScore() {
		for(int i = 0; i < students.length; i++) {
			System.out.println("======"+(i+1)+"번째 학생의 정보 출력 ======");
			System.out.printf("%s 학생의 첫번째 점수는 %d점, 두번째 점수는 %d점입니다.\n"
					, students[i].getName()
					, students[i].getFirstScore()
					, students[i].getSecondScore());
		}
	}
	// 메시지 출력
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
	
	
	
	
	
	
	
	
	
	
}
