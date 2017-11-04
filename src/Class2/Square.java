package Class2;

public class Square {

		private double length;
		
		Square() {this.length=1;}
		Square(double l) {this.length=l;}
		
		public void setLength(double l) {
			this.length=l;
		}
		public double getLength() {
			return this.length;
		}
		public double calcArea() {
			return (this.length * this.length);
		}
		
		public double calcPerimeter () {
			return (this.length *4);
		}
		
		@Override
		public String toString() {
			return "Square length equals " + this.length;
		}
}
