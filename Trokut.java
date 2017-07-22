package application;

public class Trokut {
	
	private double a;
	private double b;
	private double c;
	private double o;
	private double p;
	
	
	public Trokut(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.getO();
	}


	public double getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
		this.getO();
		this.getP();
	}


	public double getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
		this.getO();
		this.getP();
	}


	public double getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
		this.getO();
		this.getP();
	}

	public double opseg() {
		return this.o;
	}
	
	public void getO() {
		this.o = this.a + this.b + this.c;
	}
	
	public double povrsina() {
		return this.p;
	}
	
	public void getP() {
		double s = (this.a + this.b + this.c) / 2;
		this.p = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
	}
	

	
}
