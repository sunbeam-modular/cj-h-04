package sunbeam.geometry;

import sunbeam.geometry.dim2.Circle;
import sunbeam.geometry.dim3.Box;
import sunbeam.geometry.dim3.Cylinder;


public class Program {

	public static void main(String[] args) {
		Box b1 = new Box(1, 2, 3);
		System.out.println("b1 : " + b1.calcVolume());
		Circle c = new Circle(4.1);
		System.out.println("c1 : " + c.calcArea());
		Cylinder c2 = new Cylinder(10.1, 2.1); 
		System.out.println("c2 : " +c2.calcVolume());

	}

}
