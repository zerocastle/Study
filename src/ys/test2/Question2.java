package ys.test2;

/*
 * array.clone() 배열 복사
 */

import java.util.Arrays;

public class Question2 {

	public Question2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5 }; // int[] array = {1,2,3,4,5};
		int array2[] = array.clone();
		System.out.println(Arrays.toString(array));
		array2[1] = 5;
		System.out.println(Arrays.toString(array2));

	}

}
