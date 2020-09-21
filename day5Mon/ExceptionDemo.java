package day5Mon;

public class ExceptionDemo {
	public static void main(String[] args) {
		int num1,num2;
		try {
			num1=0;
			num2=5;
			System.out.println(num2/num1);
		}catch(ArithmeticException e) {
			System.out.println("should not divide by zero");
		}catch(Exception e){
			System.out.println("Exception Occured");
		}
		
	}
	

}
