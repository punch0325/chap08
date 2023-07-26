package com.exam;

public class A02_TriangleExample {
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

	
	
	static void triangle1() {
		System.out.println("1번");
		for (int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >=  j)
					System.out.print("*");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void triangle2() {
		System.out.println("2번");
		for (int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <=  j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void triangle3() {
		System.out.println("3번");
		for (int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i+j <= 4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void triangle4() {
		System.out.println("4번");
		for (int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i+j >= 4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void rectangle() {
		System.out.println("사각형");
		for (int i = 0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 0 || j==4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		triangle1();
		triangle2();
		triangle3();
		triangle4();
		rectangle();
	}
}
