package oopExamples;

public class Android extends Mobile{

	Android(String man, String o, String m, int c) {
		super(man, o, m, c);
		// TODO Auto-generated constructor stub
	}
	
	//Android(String man, String o, String m) {
		//super(man, o, m);
		// TODO Auto-generated constructor stub
	//}
	
	//Android(String man, String o) {
		//super(man, o);
		// TODO Auto-generated constructor stub
	//}
	
	public String getModel() {
		return "This is an Android Mobile " + model;
	}

}
