package unibe.edu.ec.examen;

public class Triangle {
	private double side;

	public Triangle(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double calculatePerimetro() {
		double perimetro = this.side + this.side + this.side;
		return perimetro;
	}

	public double calculateArea(double heigh) {
		double area = side * heigh / 2;
		return area;
	}
	
}
