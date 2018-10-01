package ys.test;
/*
 * 뒤에 숫자가 더 크게 입력해서 b - a 수행
 */

import java.util.Scanner;

public class Question4 {

	public Question4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int signal = 0;
		do {
			if (signal > 0) {
				System.out.println("a보다 큰값을 입력해라");
			}
			signal++;
			System.out.println("숫자를 입력하세요");
			a = s.nextInt();
			b = s.nextInt();
		} while (a >= b);
		System.out.println("b - a : " + (b-a));
	}

}
