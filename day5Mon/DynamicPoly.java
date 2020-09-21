package day5Mon;

class A{
	public void display() {
		System.out.println("In Parent Class display");
	}
	void newMethod() {
		System.out.println("newmethod parent");
	}
	static void staticMethod() {
		System.out.println("parent static");
	}
}

class B extends A{
	public void display() {
		System.out.println("Child display");
	}
	public void newChildMethod() {
		System.out.println("new child method");
	}
	static void staticMethod() {
		System.out.println("child static");
	}
}
public class DynamicPoly {
	public static void main(String[] args) {
		B obj1=new B();
		obj1.display();
		obj1.newMethod();
		obj1.newChildMethod();
		obj1.staticMethod();
		
	System.out.println("\n");
		A obj2=new B();
		
		obj2.display();
		obj2.newMethod();
		obj2.staticMethod();
		//obj2 cannot access new child method

		
	}
}
