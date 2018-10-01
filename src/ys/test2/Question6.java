
package ys.test2;
/*
 * 배열 두개를 비교해서 같은지를 비교한다.
 */

public class Question6 {

	public int[] array = { 1, 2, 3, 4, 5 };
	public int[] copyArray = array.clone();
	public int[] objArray = { 4, 5, 6, 7, 8 };
                  
	public Question6() {
		// TODO Auto-generated constructor stub
	}

	public static boolean equals(int array[], int objArray[]) {
		if (array.length != objArray.length)
			return false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != objArray[i])
				return false;
			else
				return true;
		}

		return true;
	}

	public static void main(String[] args) {
		boolean result = true;
		boolean result2 = true;
		Question6 obj = new Question6();

		result = obj.equals(obj.array, obj.copyArray);
		// result = obj.equals(obj.array,obj.objArray);

		System.out.println(result ? "같다" : "다르다");

	}

}
