package com.exam;

public class A08_TriangleExample {
	//람다식 맛보기
	
	
	
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
		
		System.out.println("1번");
		darwShape((i , j ) -> i >= j);
		
		
		System.out.println("2번");
		darwShape((i , j ) -> i <= j);
		
		
		System.out.println("3번");
		darwShape((i , j ) -> i + j <= 4);
		
		
		System.out.println("4번");
		darwShape((i , j ) -> i + j >= 4);
		
		
		
	}


}
