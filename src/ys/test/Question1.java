package ys.test;
/*
 * 결정트리 , 가운데 순위의 숫자 뽑아내기  
 */

public class Question1 {

	public static int doA(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static int doB(int a, int b, int c) {

		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a >= b && c <= b) || (a <= b && c >= b))
			return b;
		return c;

	}

	public static void main(String[] args) {
		int result = new Question1().doA(7, 2, 5);
		System.out.println(result);
		System.out.println(new Question1().doB(7, 2, 5));

	}

}
