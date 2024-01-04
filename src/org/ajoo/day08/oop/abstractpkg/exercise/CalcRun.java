package org.ajoo.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// Cannot instantiate the type Calculator
//		Calculator calculator = new Calculator();
		Calculator calculator = new CherryCalc();
		CherryCalc calc = new CherryCalc();
		System.out.println("합 : " + calculator.add(11, 13));
		System.out.println("차 : " + calculator.substract(4, 25));
		int [] a = {23,11,13,4,25};
		System.out.printf("평균 : %.2f\n", calculator.average(a));
	}

}
