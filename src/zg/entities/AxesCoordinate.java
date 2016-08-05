package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class AxesCoordinate extends Coordinate {

	public final static String COORDINATE_TYPE = "AXES";

	private int x;
	private int y;

	public AxesCoordinate(String coordinate){
		String[] coordinateArr = coordinate.split(" ");
		if (coordinateArr.length != 3){
			return;
		}
		this.x = Integer.parseInt(coordinateArr[0]);
		this.y = Integer.parseInt(coordinateArr[1]);
		this.orientation = coordinateArr[2];
	}

	public AxesCoordinate(int x, int y, String orientation){
		this.x = x;
		this.y = y;
		this.orientation = orientation;
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
