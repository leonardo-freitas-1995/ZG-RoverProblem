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
			case "N":
				y++;
				break;
			case "E":
				x++;
				break;
			case "S":
				y--;
				break;
			case "W":
				x--;
				break;
		}

		return new Coordinate(x + " " + y + " " + pos.getOrientation(), Coordinate.RECTANGLE_COORDINATE);
	}
}
