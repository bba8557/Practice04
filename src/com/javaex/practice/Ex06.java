package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','1'};
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
			c[4]=','; c[7]=','; c[9]=',';
		}
		
	}
}
/*
  c[0] = T
  c[1] = h
  c[2] = i
  c[3] = s
  c[4] = 
  c[5] = i
  c[6] = s
  c[7] = 
  c[8] = a
  c[9] = 
  c[10] = p
  c[11] = e
  c[12] = n
  c[13] = c
  c[14] = i
  c[15] = 1
 */