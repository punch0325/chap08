package com.exam;

public class A02_TriangleExample4 {
//	<1>         <2>         	
//	 *			 *****             
//	 **			  ****              
//	 ***  		   ***              
//	 ****  	    **              
//	 *****		     *               

//	<3>          <4>
//	*****             *
//	****             **
//	***             ***
//	**             ****
//	*             *****
	
	
	interface Shape{
		boolean test(int i, int j);
	}
	
	static class Triangle1 implements Shape{
		@Override
		public boolean test(int i, int j) {
			return i >= j;
		}
	}
	
	static class Triangle2 implements Shape{
		@Override
		public boolean test(int i, int j) {
			return i <= j;
		}
	}
	
	static class Triangle3 implements Shape{
		@Override
		public boolean test(int i, int j) {
			return i + j <= 4;
		}
	}
	
	static class Triangle4 implements Shape{
		@Override
		public boolean test(int i, int j) {
			return i + j >= 4;
		}
	}
	

	
	static void darwShape(Shape s) {
		for (int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (s.test(i, j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {		
		System.out.println("1번");
		Shape s= new Triangle1();
		darwShape(s);
		System.out.println("2번");
		s = new Triangle2();
		darwShape(s);
		System.out.println("3번");
		s = new Triangle3();
		darwShape(s);
		System.out.println("4번");
		s = new Triangle4();
		darwShape(s);
		
//		Triangle1 triangle1 = s;   ▷ s가 상위 클래스이기 때문에 자동 형변환 불가능
		if (s instanceof Triangle1) {			
			//instanceof로 형변환이 가능한지 확인 후 강제 형변환
			Triangle1 triangle1 = (Triangle1) s;
		}
		
		
	}


}
