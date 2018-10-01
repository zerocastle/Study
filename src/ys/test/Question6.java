package ys.test;
/*
 * 드모르간 법칙
 */

import java.util.Scanner;

public class Question6 {
	public Question6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("2자리의 정수를 입력하세요 : ");
			System.out.printf("입력 : ");
			num = s.nextInt();
//		} while (num < 10 || num >= 100);
		} while(!(num>10 && num <100));
		System.out.println("result : " + num);
	}

}
