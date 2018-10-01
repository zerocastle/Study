package ys.test2;
/*
 * 배열중에서 최대값 출력
 */

public class Question3 {
	public Question3() {
		// TODO Auto-generated constructor stub

	}

	static int maxOf(int[] array) {
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max <= array[i])
				max = array[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[]array = {1,2,7,5,3};

		System.out.println(new Question3().maxOf(array));

	}

}
