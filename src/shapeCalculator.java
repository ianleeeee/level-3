import static org.junit.Assert.*;

import org.junit.Test;

public class shapeCalculator {
	@Test
	public void testShapeCalculator(){
		shapeCalculator sc = new shapeCalculator();
		assertEquals(16, sc.calculateSquarePerimeter(4));
		assertEquals(12, sc.calculateRectanglePerimeter(2,4));
		assertEquals(Math.PI, sc.calculateCircleArea(1), .001);
		assertEquals(2*Math.PI, sc.calculateCirclePerimeter(1), .001);
	}

	private Double calculateCirclePerimeter(int i) {
		double circum = i * (2*Math.PI);
		return (Double) circum;
	}

	private int calculateRectanglePerimeter(int i, int j) {
		// TODO Auto-generated method stub\
		int perim = i+i+j+j;
		return perim;
	}

	private Double calculateCircleArea(int i) {
		double area = (Math.PI)*(i*i);
		return (Double) area;
	}

	private int calculateSquarePerimeter(int i) {
		int perim = i*4;
		return perim;
	}

}
