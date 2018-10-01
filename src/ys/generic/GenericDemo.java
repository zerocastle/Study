package ys.generic;

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}

}

class Person<T, S> {
	public T info;
	public S id;

	Person(T info, S id) {
		// TODO Auto-generated constructor stub
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		System.out.println(info);
	}

}

public class GenericDemo {
	public static void main(String[] args) {
		Integer id = new Integer(2);
		EmployeeInfo e = new EmployeeInfo(3);
		Person<EmployeeInfo , Integer> p1 = new Person<EmployeeInfo , Integer>(new EmployeeInfo(1) , id);
		Person p2 = new Person(e, id); // 생성장에 값을 집어넣을때 , 지금 참조되는 변수의 값이 객체 생성이 되어 있는 탑입으로 정의 되어 있고 ,
										// 인스턴스화 할때 , 값이 참조되는것을 자바에서 알고 있기때문에 , 저롷게 생략할수 있다 .
		System.out.println(p1.info.rank);
		System.out.println(p1.id);
		
		p1.<EmployeeInfo>printInfo(e);
		
	}
}