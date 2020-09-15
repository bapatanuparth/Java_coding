package oops;

import java.util.List;

public class Car {
	public List<Wheel> wheels;  //state
	public Engine engine; //Has-A relationship
	public int price;
	
	public Car(List<Wheel> wheels, Engine engine, int price) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.price = price;
	}
	
	
}
