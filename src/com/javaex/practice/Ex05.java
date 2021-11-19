package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] data = new int[5];
		for (int i=0; i<data.length; i++) {
			int num = sc.nextInt();	
			data[i] = num;
		}
		System.out.println("평균은 " +(double) (data[0]+data[1]+data[2]+data[3]+data[4])/5 + "입니다.");
			
		
		
		
		
		
		
		sc.close();
	}

}
