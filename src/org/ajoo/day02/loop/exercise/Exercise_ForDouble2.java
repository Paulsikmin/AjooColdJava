package org.ajoo.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) {
		// 0시 0분부터 23시 59분까지 출력하기
		for(int k = 0; k < 24; k++) {
			for(int i = 0; i < 60; i++) {
				System.out.println(k +"시 "+i+"분");
			}
		}
	}
}
