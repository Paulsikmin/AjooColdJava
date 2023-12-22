package org.ajoo.day02.loop;

public class Exam_ForDouble {
	public static void main(String [] args) {
		// 1*1=1 1*2=2 1*3=3 .... 1*9=9
		// 2*1=1 2*2=4 2*3=6 .... 2*9=18
		// 3*1=1 3*2=6 3*3=9 .... 3*9=27
		// 4*1=1 4*2=8 4*3=12 .... 4*9=36
		
		// 중첩For문 - 반복이 되는 For문을 다시 반복 
		for(int j = 1; j < 10; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.print(j + " * "+i+" = " + j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
