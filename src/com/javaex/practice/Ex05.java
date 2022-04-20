package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
		int num = sc.nextInt();
		sum=num+num;
		}
		System.out.println("평균은 "+sum+" 입니다.");
		sc.close();
		
	}
}
