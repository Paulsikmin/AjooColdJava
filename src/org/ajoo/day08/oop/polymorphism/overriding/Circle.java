package org.ajoo.day08.oop.polymorphism.overriding;

// Circle이 Shape을 상속받으려고해요. 어떻게해요??
public class Circle extends Shape{
	public void draw() {
		System.out.println("Draw Circle");
	}
}
