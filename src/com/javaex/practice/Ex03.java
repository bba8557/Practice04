package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] intA = {3,6,9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
	}
}
		/*예상
		 *int[] intA[3]
		 *intA[0] = 3;
		 *intA[1] = 6;
		 *intA[2] = 9; 이렇게 표현되는데
		 *int[] intB 라는 하나더 만들어주고
		 *intB=intA; A를 B에 대입(주소복사)를 해주고
		 *intB[0]=20; intB[10]; 으로 변경을 해주어도 같은 
		 *주소를 사용 하므로 intA[0] intA[2]의 값도 같아진다
		 *고로 20,6,10이 나올것이다*/
