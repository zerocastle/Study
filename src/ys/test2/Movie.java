package ys.test2;

import java.util.Scanner;

public class Movie {
	public static final int RESERVE_SUCCESS = 1;
	public static final int RESERVE_FAIL = 0;
	public int[][] sheat = new int[5][5];
	public Scanner s = new Scanner(System.in);
	public int ask = 0;
	public char answer = '\u0000';

	public Movie() {
		// TODO Auto-generated constructor stub
		while (true) {
			this.printGuide();
			ask = s.nextInt();
			switch (ask) {
			case 1: {
				int signal = 0;
				System.out.println("몇행 몇열");
				int row = s.nextInt();
				int col = s.nextInt();
				signal = this.reserve(row, col);
				if (signal == RESERVE_SUCCESS) {
					System.out.println("예약성공");
				} else
					System.out.println("예약실패");
				break;
			}
			case 2: {
				this.list();
				break;
			}
			default:
				break;
			}

			if (ask == -1) {
				System.out.println("종료합니다.");
				break;
			}

		}

	}

	private int reserve(int row, int col) {
		// TODO Auto-generated method stub
		int signal = 0;
		System.out.println("예약부분");
		if (this.sheat[row - 1][col - 1] == 1) {
			System.out.println("예약 되어 있음");
			signal = Movie.RESERVE_FAIL;
		} else
			signal = Movie.RESERVE_SUCCESS;

		this.sheat[row - 1][col - 1] = 1;
		return signal;

	}

	public void printGuide() {
		// TODO Auto-generated method stub
		System.out.println("=====어서오세요======");
		System.out.println("1.예약 2.좌석확인 3.종료(-1)");
		System.out.println("==================");

	}

	public void list() {
		for (int i = 0; i < this.sheat.length; i++) {
			for (int j = 0; j < this.sheat[i].length; j++) {
				System.out.printf("%2d", this.sheat[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Movie();
	}

}
