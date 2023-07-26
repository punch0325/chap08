package com.exam;

public class A06_TriangleAnnoymousExample {
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
//		일회성으로 코드를 짤 때에는 익명 자식 객체를 쓰면 훨씬 코드가 깔끔해진다 (A02_TriangleExample4랑 비교해볼 것)
		
		System.out.println("1번");
		darwShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i >= j;
			}
		});
		
		System.out.println("2번");
		darwShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i <= j;
			}
		});
		
		
		System.out.println("3번");
		darwShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i + j <= 4;
			}
		});
		
		
		
		System.out.println("4번");
		darwShape(new Shape() {
			@Override
			public boolean test(int i, int j) {
				return i + j >= 4;
			}
		});
		
		
		
	}


}
