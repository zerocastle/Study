package ys.test2;

import java.util.Scanner;

/*
 * 윤년에 대한걸 판단 , 해에 대한 날짜 계산하는 방법
 */

public class Question9 {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 윤년

	public Question9() {

	}

	static int isLeap(int year) {
		int signal = 0;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

			signal = 1;
		} else
			signal = 0;
		return signal;
	}

	static int print(int year, int month, int day) {
		int front = isLeap(year);
		int result = 0;
		for (int i = 0; i <= front; i++) {

			for (int j = 0; j < month - 1; j++) {

				result = result + mdays[i][j];
			}
		}
		return result + day;
	}
	static int doNmg(int year , int month , int day) {
		int result = 0;
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ask = 0;
		int year = 0;
		int month = 0;
		int day = 0;
		int result = 0;
		while (true) {
			System.out.println("그 해 경과 일 수를 구합니다.");
			System.out.printf("년 : ");
			year = s.nextInt();
			System.out.printf("월 : "); 
			month = s.nextInt();
			System.out.printf("일 : ");
			day = s.nextInt();
			result = Question9.print(year, month, day);
			System.out.println("그 해 " + result + "일째입니다.");
			System.out.println("그해 남은일자" + (365-result) + "일 남았습니다.");
			System.out.printf("한 번 더 할까요 ? (1.예 / 0.아니오)");
			ask = s.nextInt();
			if (ask == 0)
				break;
		}

	}

}
