package ys.test2;

/*
 *	Random 클래스의 nextInt , nextBoolean , nextFloat 같은 여러가지 메소드 사용
 */

import java.util.Arrays;
import java.util.Random;

public class Question4 {
	public Question4() {
		// TODO Auto-generated constructor stub
	}

	static int doAction(int[] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (max <= array[i])
				max = array[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Question4 obj = new Question4();
		int[] array = new int[5];
		boolean[] array2 = new boolean[5];

		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = 100 + r.nextInt(90);

		}
		System.out.println(obj.doAction(array));

		for (int i = 0; i < array2.length; i++) {
			array2[i] = r.nextBoolean();
		}
		
		System.out.println(Arrays.toString(array2));

	}

}
