enum Direction {
	NORTH(0), EAST(90), SOUTH(180), WEST(270);

	private int degrees;

	// Static field
	private static final int TOTAL_DIRECTIONS = 4;

	// Constructor
	Direction(int degrees) {
		this.degrees = degrees;
	}

	// Getter method
	public int getDegrees() {
		return degrees;
	}

	// Static method
	public static int getTotalDirections() {
		return TOTAL_DIRECTIONS;
	}
}
