package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class CircleTerrain extends Terrain {

	// Movement unit constants
	private final static double ARC_MOVEMENT_UNIT = 1;
	private final static int RADIUS_MOVEMENT_UNIT = 1;

	private final int radius;

	public CircleTerrain(int radius) {
		this.radius = radius;
	}

	@Override
	public Coordinate moveRover(Coordinate coordinate) {
		CircleCoordinate pos = (CircleCoordinate) coordinate;
		int r = pos.getR();
		double angle = pos.getAngle();
		switch (pos.getOrientation()){
			case Coordinate.NORTH:
				r += RADIUS_MOVEMENT_UNIT;
				break;
			case Coordinate.EAST:
				angle -= (ARC_MOVEMENT_UNIT / this.radius);
				break;
			case Coordinate.SOUTH:
				r -= RADIUS_MOVEMENT_UNIT;
				break;
			case Coordinate.WEST:
				angle += (ARC_MOVEMENT_UNIT / this.radius);
				break;
		}
		if (angle > Math.PI * 2){
			angle -= Math.PI * 2;
		}
		else if (angle < 0){
			angle += Math.PI * 2;
		}
		if (r < 0 || r > this.radius){
			return null;
		}

		return new CircleCoordinate(r, angle, pos.getOrientation());
	}
}
