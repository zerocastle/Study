package ys.test2;
/*
 * 역순 정렬하기 
 */

import java.util.Arrays;

public class Question5 {
	
	public Question5() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int []array = {6,5,4,3,2,1,0}; 
		
		for(int i = 0; i<array.length/2; i++) {
			System.out.println(Arrays.toString(array));
			int temp = array[i];
			array[i] = array[array.length-(i + 1)];
			array[array.length-(i+1)] = temp;
			System.out.println(array[i] + "과" + array[array.length-(i+1)] + "를 교환합니다.");
		}
		System.out.println(Arrays.toString(array));
		System.out.println("역순 정렬을 완료합니다.");
		
	}

}
