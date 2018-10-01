package ys.test;
/*
 * 두수 포함 사이의 숫자 더한결과
 */

import java.util.Scanner;

public class Question3 {
	public static Scanner s = new Scanner(System.in);

	public Question3() {
		// TODO Auto-generated constructor stub

	}

	static int sumof(int a, int b) {
		System.out.println("숫자를 입력하세요 : ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int result = 0;
		for(int i = a; i <=b; i++) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		Question3 obj = new Question3();
		System.out.println(obj.sumof(1, 10));
	}

}
