package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class RectangleTerrain extends Terrain {

	// Movement unit constants
	private final static int Y_AXIS_MOVEMENT_UNIT = 1;
	private final static int X_AXIS_MOVEMENT_UNIT = 1;

	private final int maxHorizontal;
	private final int maxVertical;

	public RectangleTerrain(int maxHorizontal, int maxVertical) {
		this.maxHorizontal = maxHorizontal;
		this.maxVertical = maxVertical;
	}

	@Override
	public Coordinate moveRover(Coordinate coordinate) {
		if (!coordinate.getCoordinateType().equals(AxesCoordinate.COORDINATE_TYPE)){
			return null;
		}
		AxesCoordinate pos = (AxesCoordinate) coordinate;
		int x = pos.getX();
		int y = pos.getY();
		switch (pos.getOrientation()){
			case Coordinate.NORTH:
				y += Y_AXIS_MOVEMENT_UNIT;
				break;
			case Coordinate.EAST:
				x += X_AXIS_MOVEMENT_UNIT;
				break;
			case Coordinate.SOUTH:
				y -= Y_AXIS_MOVEMENT_UNIT;
				break;
			case Coordinate.WEST:
				x -= X_AXIS_MOVEMENT_UNIT;
				break;
		}

		if (x < 0 || x > maxHorizontal ||
			y < 0 || y > maxVertical){
			return null;
		}

		return new AxesCoordinate(x, y, pos.getOrientation());
	}
}
