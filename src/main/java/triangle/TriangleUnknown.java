package triangle;

public class TriangleUnknown implements Triangle {

	/** This implementation does not really know anything about triangles and always returns unknown */
	@Override
	public TriangleResult getTriangleResultForLenghts(final int... lengths) {
		return TriangleResult.UNKNOWN;
	}

}
