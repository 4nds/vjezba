package application;

public class Pravokutnik {
	
	private double a;
	private double b;
	private double o;
	private double p;
	
	public Pravokutnik(double a, double b) {
		this.a = a;
		this.b = b;
		this.getO();
		this.getP();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
		this.getO();
		this.getP();
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
		this.getO();
		this.getP();
	}
	
	public double opseg() {
		return this.o;
	}
	
	public void getO() {
		this.o = (this.a + this.b)*2;
	}
	
	public double povrsina() {
		return this.p;
	}
	
	public void getP() {
		this.p = this.a*this.b;
	}
	
	
	

}
