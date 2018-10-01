package ys.test;
/*
 * 숫자 피라미드 
 */

import java.util.Scanner;

public class Question8 {
	public Question8() {
		// TODO Auto-generated constructor stub
	}

	static void npira(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.printf(" ");
			}
			for (int j = 0; j < (i+1)*2-1; j++) {
				System.out.printf("%d",i + 1);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = s.nextInt();
		new Question8().npira(num);
	}

}
