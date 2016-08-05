package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class RectangleCoordinate extends Coordinate {

	public final static String COORDINATE_TYPE = "CIRCLE";

	private int x;
	private int y;

	public RectangleCoordinate(String coordinate){
		String[] coordinateArr = coordinate.split(" ");
		if (coordinateArr.length != 3){
			return;
		}
		this.x = Integer.parseInt(coordinateArr[0]);
		this.y = Integer.parseInt(coordinateArr[1]);
		this.setOrientation(coordinateArr[2]);
	}

	public RectangleCoordinate(int x, int y, String orientation){
		this.x = x;
		this.y = y;
		this.setOrientation(orientation);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String getCoordinateType() {
		return COORDINATE_TYPE;
	}

	@Override
	public String toString() {
		return this.getX() + " " + this.getY() + " " + this.getOrientation();
	}
}
