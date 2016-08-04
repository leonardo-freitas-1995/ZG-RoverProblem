package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class RectangleTerrain extends Terrain {

	private final int maxHorizontal;
	private final int maxVertical;

	public RectangleTerrain(int maxHorizontal, int maxVertical) {
		this.maxHorizontal = maxHorizontal;
		this.maxVertical = maxVertical;
	}

	@Override
	public Coordinate moveRover(Coordinate pos) {
		int x = pos.getX();
		int y = pos.getY();
		switch (pos.getOrientation()){
			case Coordinate.NORTH:
				y++;
				break;
			case Coordinate.EAST:
				x++;
				break;
			case Coordinate.SOUTH:
				y--;
				break;
			case Coordinate.WEST:
				x--;
				break;
		}

		if (x < 0 || x > maxHorizontal ||
			y < 0 || y > maxVertical){
			return null;
		}

		return new Coordinate(x, y, pos.getOrientation());
	}
}
