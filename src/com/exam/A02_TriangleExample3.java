package com.exam;

public class A02_TriangleExample3 {
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
	
	
	static abstract class Shape{
		abstract boolean test(int i, int j);
	}
	
	static class Triangle1 extends Shape{
		@Override
		boolean test(int i, int j) {
			return i >= j;
		}
	}
	
	static class Triangle2 extends Shape{
		@Override
		boolean test(int i, int j) {
			return i <= j;
		}
	}
	
	static class Triangle3 extends Shape{
		@Override
		boolean test(int i, int j) {
			return i + j <= 4;
		}
	}
	
	static class Triangle4 extends Shape{
		@Override
		boolean test(int i, int j) {
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
	}


}
