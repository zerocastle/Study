package ys.test2;

/*
 * 진수 입력 받아서 정해져있는 레퍼런스 아스키보드를 보고 , 변환시켜서 배열로 저장한뒤 역으로 출력
 */

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {

	public static Scanner s = new Scanner(System.in);
	public static char[] resultArray = new char[8];

	public static int convert(char[] resultArray, int x, int r) {
		int counter = 0;
		String card = "0123456789ABCDEF";

		int result = resultArray.length;
		do {
			Question7.resultArray[counter++] = card.charAt(x % r);
			x = x / r;
		} while (x != 0);
		return result;
	}

	public static void main(String[] args) {
		Question7 obj = new Question7();
		System.out.println("10진수의 값을 입력하세요 ");
		int x = s.nextInt();
		System.out.println("몇진수로 나눌껀데?");
		int r = s.nextInt();
		int resultCounter = obj.convert(obj.resultArray, x, r);
		System.out.println(resultCounter + "개의 숫자가 변형 되었습니다");
		for (int i = 0; i < obj.resultArray.length / 2; i++) {
			char temp = obj.resultArray[i];
			obj.resultArray[i] = obj.resultArray[resultArray.length - (i + 1)];
			obj.resultArray[resultArray.length - (i + 1)] = temp;
		}
		System.out.println(Arrays.toString(obj.resultArray));
	}

}
