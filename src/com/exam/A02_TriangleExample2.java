package com.exam;

public class A02_TriangleExample2 {
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
	
	
	static class Show{
		boolean test(int i, int j) {
			return true;
		}
	}
	
	static class Triangle1 extends Show{
		@Override
		boolean test(int i, int j) {
			return i >= j;
		}
	}
	
	static class Triangle2 extends Show{
		@Override
		boolean test(int i, int j) {
			return i <= j;
		}
	}
	
	static class Triangle3 extends Show{
		@Override
		boolean test(int i, int j) {
			return i + j <= 4;
		}
	}
	
	static class Triangle4 extends Show{
		@Override
		boolean test(int i, int j) {
			return i + j >= 4;
		}
	}
	

	
	static void darwShape(Show show) {
		for (int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (show.test(i, j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {		
		System.out.println("1번");
		Show show = new Triangle1();
		darwShape(show);
		System.out.println("2번");
		show = new Triangle2();
		darwShape(show);
		System.out.println("3번");
		show = new Triangle3();
		darwShape(show);
		System.out.println("4번");
		show = new Triangle4();
		darwShape(show);
	}


}
