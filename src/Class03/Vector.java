package Class03;

public class Vector {
	private double x;
	private double y;
	private double z;
	
	Vector() {
		this.x=0; 
		this.y=0; 
		this.z=0;
	}
	
	Vector (double a, double b, double c) {
		this.x=a;
		this.y=b;
		this.z=c;
	}
	
	public void setX(double a) {
		this.x=a;
	}

	public void setY(double a) {
		this.y=a;
	}

	public void setZ(double a) {
		this.z=a;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void add(Vector v) {
		this.x+=v.x;
		this.y+=v.y;
		this.z+=v.z;	
	}
	
	public void minus(Vector v) {
		this.x-=v.x;
		this.y-=v.y;
		this.z-=v.z;	
	}
	
	public void multiply(double a) {
		this.x*=a;
		this.y*=a;
		this.z*=a;	
	}
	
	@Override
	public String toString() {
		return "Vector : x - " +this.x + ", y - " + this.y + ", z - " + this.z ;
	}

}
