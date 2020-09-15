package oops;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Wheel> w4=new ArrayList<Wheel>();
		
		w4.add(new Wheel(10.0, 50.2, 2.0, 50));
		w4.add(new Wheel(10.0, 50.2, 2.0, 50));
		w4.add(new Wheel(10.0, 50.2, 2.0, 50));
		w4.add(new Wheel(10.0, 50.2, 2.0, 50));
		
		Car c1=new Car(w4, new Engine(50,TYPE.D), 1000);
		System.out.println(c1.engine.getT1());

	}

}
