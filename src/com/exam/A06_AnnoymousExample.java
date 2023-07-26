package com.exam;

public class A06_AnnoymousExample {
	/*
	 * 익명 자식 객체
	 * 익명 구현 객체
	 */
	
	static abstract class A {
		abstract void show();
	}
	
	static class B extends A {
		@Override
		void show() {
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
//		자식 클래스 B를 인스턴스화
		A a1 = new B();
		
		
//		익명 자식 객체를 선언
		A a2 = new A() {
			@Override
			void show() {
				System.out.println("Annoymous.show()...");
			}
		};
	
		a2.show();
	
	
	}

}
