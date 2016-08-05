package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class RadiusCoordinate extends Coordinate {

	public final static String COORDINATE_TYPE = "RADIUS";

	private int r;
	private double angle;

	public RadiusCoordinate(String coordinate){
		String[] coordinateArr = coordinate.split(" ");
		if (coordinateArr.length != 3){
			return;
		}
		this.r = Integer.parseInt(coordinateArr[0]);
		this.angle = Double.parseDouble(coordinateArr[1]);
		this.orientation = coordinateArr[2];
	}

	public RadiusCoordinate(int r, double angle, String orientation){
		this.r = r;
		this.angle = angle;
		this.orientation = orientation;
	}

	public int getR() {
		return r;
	}

	public double getAngle() {
		return angle;
	}

	@Override
	public String getCoordinateType() {
		return COORDINATE_TYPE;
	}

	@Override
	public String toString() {
		return this.getR() + " " + this.getAngle() + " " + this.getOrientation();
	}
}
