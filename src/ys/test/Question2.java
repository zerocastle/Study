package ys.test;
/*
 * 가우스의 덧셈
 */

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 11 - i; j > (10 - i); j--) {
				sum = sum + (i + j);
				System.out.println(sum);
			}

		}
		System.out.println("sum : " + sum / 2);
	}

}
