package com.exam;

public class A06_AnnoymousExample2 {
	interface Showable {
		void show();
		void hide();	
	}
	
	static class A implements Showable{

		@Override
		public void show() {
		}

		@Override
		public void hide() {
		}
		
		void move() {
			
		}
		
	}
	
	public static void main(String[] args) {
		Showable a = new A();
		a.show();
		a.hide();
//		a.move();  ▶ a는 Showable 인터페이스의 객체이기 때문에 부모에게 상속 받지 않은 move 메소드는 사용 불가
		
		
		
//		익명 자식 객체 선언
		Showable b = new Showable() {
			@Override
			public void show() {
			}
			
			@Override
			public void hide() {
			}
		};
		
		b.show();
		b.hide();
		

	}

}
