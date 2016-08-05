package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public abstract class Coordinate {

	// Orientation constants
	public final static String NORTH = "N";
	public final static String EAST = "E";
	public final static String SOUTH = "S";
	public final static String WEST = "W";

	protected String orientation;

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation){
		this.orientation = orientation;
	}

	@Override
	public abstract String toString();
	public abstract String getCoordinateType();
}
