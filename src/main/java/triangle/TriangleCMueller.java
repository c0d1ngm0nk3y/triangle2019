package triangle;

public class TriangleCMueller implements Triangle {

	@Override
	public TriangleResult getTriangleResultForLengths(int... lengths) {
		if (lengths == null) {
			return TriangleResult.UNKNOWN;
		}
		if (lengths.length != 3) {
			return TriangleResult.UNKNOWN;
		}
		final int a = lengths[0];
		final int b = lengths[1];
		final int c = lengths[2];
		if (a < 0 || b < 0 || c < 0) {
			return TriangleResult.UNKNOWN;
		}
		if (a == 0 || b == 0 || c == 0) {
			return TriangleResult.UNKNOWN;
		}
		if (a == b && b == c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		if (a == b) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		if (b == c) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		if (a == c) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}

}
