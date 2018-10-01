package ys.test2;

import java.util.Arrays;
/*
 * 소수 구하는 방법
 */

public class Question8 {
	public Question8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int counter = 0;
		int[] prime = new int[100];
		int ptr = 0;

		for (int i = 2; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				prime[ptr++] = i;
				System.out.println("소수 : " + i);
				counter = 0;
			}else
				counter = 0;
		}
		
		System.out.println(Arrays.toString(prime));

	}

}
