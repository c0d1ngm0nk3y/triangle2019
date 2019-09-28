package triangle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TriangleCMuellerTest {

    public static final Triangle triangle = new TriangleCMueller();

    @Test
    public void testGetTriangleResultForLengthsNotEqual() {
        final int[] input = { 5, 6, 7 };
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsNotEqualVariables() {
        final int a = 5;
        final int b = 6;
        final int c = 7;
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsNotEqual2() {
        final int[] input = { 50, 70, 90 };
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsIsosceles() {
        final int[] input = { 2, 2, 3 };
        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsIsosceles2() {
        final int[] input = { 50, 50, 80 };
        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsEquiliteral() {
        final int[] input = { 1, 1, 1 };
        final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsEquiliteral2() {
        final int[] input = { 42, 42, 42 };
        final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsIsNull() {
        final int[] input = null;
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testGetTriangleResultForLengthsIsosceles3() {
        final int[] input = {3,5,5};
        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsInvalidTriangleToLessLengths() {
        final int[] input = {3,5};

        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthTwoSameLengths() {
        final int[] input = {8,1,8};

        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void testGetTriangleResultForLengthsInvalidTriangleToManyLengths() {
        final int[] input = {3,5, 8, 10};
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsLengthNegative() {
        final int[] input = {-1,-1, -1};
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsLengthNull() {
        final int[] input = {0,0,0};
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }
}
