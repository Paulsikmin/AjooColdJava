package org.ajoo.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		int count = 1;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			count++;
			System.out.println();
		}
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
//		System.out.println("*****");
//		System.out.println("******");
	}
}
