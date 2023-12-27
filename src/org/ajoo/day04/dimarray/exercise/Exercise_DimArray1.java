package org.ajoo.day04.dimarray.exercise;

public class Exercise_DimArray1 {
	public static void main(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		// 5 4 3 2 1
		// nums[0][4], nums[0][3], nums[0][2], nums[0][1], nums[0][0]
		// 10 9 8 7 6
		// nums[1][4], nums[1][3], nums[1][2], nums[1][1], nums[1][0]
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21		
		int nums [][] = new int[5][5];
		int k = 1;
		// 이차원배열 데이터 입력
		for(int i = 0; i < nums.length; i++) {
			for(int j = nums.length-1; j >= 0; j--) {
				nums[i][j] = k++;
			}
		}
		// 이차원 배열 출력
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
