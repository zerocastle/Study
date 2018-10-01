package ys.generic;

public class GenericClassTaster {
	
	public static void main(String[] args) {
		Generic<String> obj = new Generic<String>("hellow");
		Generic<Integer> obj2 = new Generic<Integer>(120);
		
		System.out.println(obj.getXyz());
		System.out.println(obj2.getXyz());
	}

}

class Generic<T>{
	private T xyz;
	
	Generic(T t){
		this.xyz = t;
	}
	
	public T getXyz() {
		return xyz;
	}
}
