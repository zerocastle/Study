package ys.generic;

abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfo2 extends Info {

	private int rank;

	public EmployeeInfo2(int rank) {
		// TODO Auto-generated constructor stub
		this.rank = rank;
	}

	public int getLevel() {
		// TODO Auto-generated method stub
		return this.rank;
	}
}

class Hello{
	public String sex;
	
	public Hello(String sex) {
		// TODO Auto-generated constructor stub
		this.sex = sex;
	}
}

class Person2<T extends Info> {
	public T info;

	Person2(T info) {
		this.info = info;
		info.getLevel(); // 현제 제네릭으로 상속관계라는것을 정의 했기때문에 , 위에 있는 메소드를 호출하는것이 가능하다 .
	}
}

public class GenericDemo2 {
	public static void main(String[] args) {
		Person2<EmployeeInfo2> p1 = new Person2<EmployeeInfo2>(new EmployeeInfo2(2));
		System.out.println(p1.info.getLevel());
//		Person2<Hello> p2 = new Person2<Hello>(new Hello("남자")); 이 자식은 Info 클래스와 상속관계가 아니다 .
		
	}

}
/*
 * 
 */
