package ys.test;

import java.util.Scanner;
/*
 * 자릿수 판단
 */

public class Question5 {

	public Question5() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요  : ");
		int num = s.nextInt();
		if((num >= 0 && num < 10)) {
			System.out.println("나는 한자리숫자야");
		}else if(num < 100)
			System.out.println("나는 두자리 숫자야");
		else if(num < 1000)
			System.out.println("나는 세자리 숫자야 ");
	}

}
