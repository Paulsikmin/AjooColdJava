package org.ajoo.day09.collection.list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_List1 {
	public static void main(String[] args) {
		// 이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을
		// 출력하여라.
		Scanner sc = new Scanner(System.in);
		// 1. 문자열만 삽입가능한 ArrayList 컬렉션 생성
//		ArrayList<String> strList = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>(); // 업캐스팅
		// 2. 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String input = sc.next();
			strList.add(input);
		}
//		System.out.print("이름을 입력하세요 >> ");
//		strList.add(sc.next());
//		System.out.print("이름을 입력하세요 >> ");
//		strList.add(sc.next());
//		System.out.print("이름을 입력하세요 >> ");
//		strList.add(sc.next());
		// 3. ArrayList에 들어있는 모든 이름 출력
		for(int i = 0; i < 4; i++) {
			System.out.println(strList.get(i));
		}
		// 4. 가장 긴 이름 출력
		int longIndex = 0;
		for(int i = 0; i < 4; i++) {
			if(strList.get(longIndex).length() < strList.get(i).length()) {
				longIndex = i;
			}
		}
		System.out.println("가장 긴 이름은 : " + strList.get(longIndex));
		sc.close();
	}
}
















