package day5Mon;

abstract class Sum{
	public abstract int sum1(int a,int b);
	public abstract int sum2(int a,int b,int c);
	public void display() {
		System.out.println("in parent abstract");
	}
	
}

class NewClass extends Sum{
	@Override
	public int sum1(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	@Override
	public int sum2(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	
}
public class AbstractDemo {
	public static void main(String[] args) {
		Sum obj=new NewClass();
		obj.sum1(5, 77);
		obj.sum2(3, 4, 5);
		obj.display();
	}
}
