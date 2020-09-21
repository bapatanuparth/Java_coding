package day5Mon;

class Calc{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class StaticPoly {
	public static void main(String[] args) {
		Calc obj=new Calc();
		System.out.println(obj.add(3, 4));
		System.out.println(obj.add(45, 2, 77));
		
	}
	
}
