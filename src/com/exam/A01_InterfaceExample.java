package com.exam;

public class A01_InterfaceExample {
//	일반 클래스 : 중첩 클래스, 필드, static block, 메소드, 생성자를 가지면서 이 요소들을 인스턴스화 할 수 있다.
	static class A {

	}

//	추상 클래스 : 갖고 있는 요소들을 new 연산자로 인스턴스화 불가능하다 (불완전 클래스), 주로 상속을 통해 코드 중복을 줄이려고 추상 클래스를 만든다.
	static abstract class B{
		static int count = 0;
		int num;
		
		static {
			
		}
		
		void show() {
			
		}
		
		public B() {
		
		}
		
		abstract void hide(); // 일반 클래스에서는 가질 수 없는 추상 메소드를 가질 수 있다.
	}
	
	
	static class AA extends A {
		
	}
	
//	추상 클래스를 상속 받으려할 때, 그 추상 클래스가 추상 메소드를 갖고 있다면 반드시 자식 클래스에서 그 추상메소드를 오버라이딩 하여야 한다.
	static class BB extends B {
		@Override
		void hide() {
			System.out.println("추상 메소드 구현!");
		}
	}
	

	

	
//	interface : 기본적으로 enum처럼 static이다. 
	interface Showable {
		void show();
		void hide();
		// 추상 메소드를 강제함으로서 코드의 질서를 유지하고자 하는 역할 (abstract는 생략해도 컴파일러가 자동으로 추가해줌)
	}
	
	interface Moveable{
		void left();
		void right();
		void up();
		void down();
	}

// 구현 클래스 : 인터페이스를 상속 받은 클래스. 인터페이스를 상속 받을 때엔 implements를 사용한다.	
	static class E implements Showable, Moveable{ // 인터페이스는 다중 상속이 가능
		@Override
		public void show() {
		}

		@Override
		public void hide() {
		}

		@Override
		public void left() {
		}

		@Override
		public void right() {
		}

		@Override
		public void up() {
			
		}

		@Override
		public void down() {
		}
		
	}
	
	
	
	

	
	public static void main(String[] args) {
		A a = new A();
//		B b = new B();  ▶ B는 추상 클래스이므로 객체 생성 불가
		BB bb = new BB();
		bb.hide();
		
//		Showable showable = new Showable();   ▶ showable은 인터페이스이므로 객체 생성 불가
		
		Showable s = null;
		s = new E();
		//이건 가능
		
		
		
	}

}
