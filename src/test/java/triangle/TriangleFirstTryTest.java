package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleFirstTryTest {

	public static final Triangle triangle = new TriangleFirstTry();

	@Test
	public void testGetTriangleResultForLenghtsNotEqual() {
		final int[] input = { 5, 6, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLenghts(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqualVariables() {
		final int a = 5;
		final int b = 6;
		final int c = 7;
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual2() {
		final int[] input = { 50, 70, 90 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		final TriangleResult result = triangle.getTriangleResultForLenghts(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles() {
		final int[] input = { 2, 2, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLenghts(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles2() {
		final int[] input = { 50, 50, 80 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		final TriangleResult result = triangle.getTriangleResultForLenghts(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquiliteral() {
		final int[] input = { 1, 1, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLenghts(input);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquiliteral2() {
		final int[] input = { 42, 42, 42 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		final TriangleResult result = triangle.getTriangleResultForLenghts(input);
		assertThat(result).isEqualTo(expected);
	}

}
