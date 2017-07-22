package application;

public class Krug {
	
	private double r;
	private double o;
	private double p;
	
	public Krug(int r) {
		this.r = r;
		this.getO();
		this.getP();
	}

	public double getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
		this.getO();
		this.getP();
	}
	
	public double opseg() {
		return this.o;
	}
	
	public void getO() {
		this.o = this.r*2 * Math.PI;
	}
	
	public double povrsina() {
		return this.p;
	}
	
	public void getP() {
		this.p = Math.pow(this.r, 2) * Math.PI; ;
	}

}
