package day5Mon;

interface MyInterface{
	public void method1();
}

interface MyInterface2 extends MyInterface{
	public void method2();
}
public class InterfaceDemo implements MyInterface2 {
@Override
public void method1() {
	// TODO Auto-generated method stub
	System.out.println("method 1");
	
}
@Override
	public void method2() {
		// TODO Auto-generated method stub
	System.out.println("method 2 interface 2");
	}

	public static void main(String[] args) {
		InterfaceDemo obj=new InterfaceDemo();
		obj.method1();
		obj.method2();
	}
	
}
