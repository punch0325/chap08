package com.exam;

public class A04_InterfaceMemberExample {
	interface Moveable{
		/*(public static final)*/ int BLACK = 0; 
		/*(public abstract)*/ void move();
		
//		인터페이스는 인스턴스화 할 수 없기 때문에 인스턴스 성향을 가진 메소드라도 구현 클래스를 만들어야만 사용이 가능함
		default void xxx(){
			System.out.println("인스턴스 메소드");
		}
		
//		yyy()가 static 메소드이기 때문에 객체 생성 없이 사용 가능
		static void yyy() {
			System.out.println("static 메소드");
		}
		
		
//		원래 interface는 상수와 추상메소드만 포함 가능했었는데 버전이 업데이트 되면서 default와 static 메소드도 포함 될 수 있다.
		
	}	
	
	static class A implements Moveable {

		@Override
		public void move() {
			
		}
		
	}
		

	public static void main(String[] args) {
		A a = new A();
		a.xxx();
		Moveable.yyy(); 
	}

}
