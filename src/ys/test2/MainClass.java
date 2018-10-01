package ys.test2;
/*
 * 클래스 배배열에 담기 
 */

class Member {

	public String name;
	public int height;
	public double vision;

	public Member(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " \t" + height + " \t" + vision;
	}

}

public class MainClass {
	Member[] list = { new Member("kys", 178, 0.5), new Member("sss", 180, 0.7), new Member("hsk", 150, 0.5) };

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public void printList(Member[] list) {
		System.out.println("==============신체검사 리스트==============");
		System.out.println("이름 \t 키 \t 시력");
		System.out.println("=======================================");
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("평균키 : " + this.listHeightAverage(list));
	}

	public double listHeightAverage(Member[] list) {
		double result = 0.0d;
		for (int i = 0; i < list.length; i++) {
			result = result + list[i].height;
		}
		return result / list.length;
	}

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		obj.printList(obj.list);
	}

}
