package oopExamples;

public class Mobile {
	
	private String manufacturer;
	private String operating_system;
	public String model;
	private int cost;
	
	Mobile(String man, String o, String m, int c){
		this.manufacturer = man;
		this.operating_system = o;
		this.model=m;
		this.cost=c;
	}

	
	public String getModel() {
		return this.model;
	}
	
}
