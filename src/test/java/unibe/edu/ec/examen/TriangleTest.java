package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	private Triangle triangle;

	@Before
	public void before() {
		this.triangle = new Triangle(7.5);

	}

	@Test
	public void calculatePerimetro() {
		assertEquals(22.5, triangle.calculatePerimetro(), 0.10);
	}

}
