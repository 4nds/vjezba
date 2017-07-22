package application;

public class Kvadrat extends Pravokutnik {
	
	private double a;
	
	public Kvadrat(double a) {
		super(a, a);
	}
	
	public void setA(double a) {
		super.setA(a);
		super.setB(a);
	}

}
