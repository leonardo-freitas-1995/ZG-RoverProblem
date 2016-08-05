package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class CircleCoordinate extends Coordinate {

	private static String COORDINATE_TYPE = "RECTANGLE";

	private int r;
	private double angle;

	public CircleCoordinate(String coordinate){
		String[] coordinateArr = coordinate.split(" ");
		if (coordinateArr.length != 3){
			return;
		}
		this.r = Integer.parseInt(coordinateArr[0]);
		this.angle = Double.parseDouble(coordinateArr[1]);
		this.setOrientation(coordinateArr[2]);
	}

	public CircleCoordinate(int r, double angle, String orientation){
		this.r = r;
		this.angle = angle;
		this.setOrientation(orientation);
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
