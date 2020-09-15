package oops;
enum TYPE{P,D}
public class Engine {
	
	private TYPE t1;
	public TYPE getT1() {
		return t1;
	}
	public void setT1(TYPE t1) {
		this.t1 = t1;
	}
	private int hp;
	public Engine(int hp,TYPE t) {
		super();
		this.hp = hp;
		this.t1=t;
	}
	

}
