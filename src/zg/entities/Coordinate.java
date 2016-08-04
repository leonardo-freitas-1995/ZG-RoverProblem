package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class Coordinate {

	public String RECTANGLE_COORDINATE = "rect";
	public String CIRCLE_COORDINATE = "circle";

	private int x;
	private int y;
	private int r;
	private double angle;
	private String orientation;
	private String orientationType;

	public Coordinate(String coordinate, String coordinateType){
		String[] coordinateArr = coordinate.split(" ");
		if (coordinateType.equals(RECTANGLE_COORDINATE)){
			if (coordinateArr.length != 3){
				return;
			}
			this.x = Integer.parseInt(coordinateArr[0]);
			this.y = Integer.parseInt(coordinateArr[1]);
			this.orientation = coordinateArr[2];
		}
		else if (coordinateType.equals(CIRCLE_COORDINATE)){
			if (coordinateArr.length != 3){
				return;
			}
			this.r = Integer.parseInt(coordinateArr[0]);
			this.angle = Double.parseDouble(coordinateArr[1]);
			this.orientation = coordinateArr[2];
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public double getAngle() {
		return angle;
	}

	public String getOrientation() {
		return orientation;
	}

	public String getOrientationType() {
		return orientationType;
	}

	public void setOrientation(String orientation){
		this.orientation = orientation;
	}
}
