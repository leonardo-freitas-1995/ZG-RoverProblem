package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class RectangleTerrain extends Terrain {

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

		return new Coordinate(x + " " + y + " " + pos.getOrientation(), Coordinate.RECTANGLE_COORDINATE);
	}
}
