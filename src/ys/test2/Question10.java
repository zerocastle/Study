package ys.test2;

import java.util.Arrays;
/*
 * for - each
 */

public class Question10 {

	public Question10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10}};
		int[][] b = a.clone();
		
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		System.out.println("=====================================");
		
		double[] d = {1.0,2.0,3.0,4.0,5.0};
		double sum = 0.0d;
		for(double i : d) {
			sum = sum + i;
		}           
		
		System.out.println(sum);
	}

}
