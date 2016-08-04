package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class Rover {

	// Movements constants
	private final static String MOVEMENT_LEFT = "L";
	private final static String MOVEMENT_RIGHT = "R";
	private final static String MOVEMENT_FORWARD = "M";

	private Coordinate position;
	private Terrain terrain;

	public void sendToTerrain(Terrain terrain, Coordinate startPos){
		this.terrain = terrain;
		this.position = startPos;
	}

	public void makeMovement(String movement){
		switch (movement){
			case MOVEMENT_LEFT:
				this.turnLeft();
				break;
			case MOVEMENT_RIGHT:
				this.turnRight();
				break;
			case MOVEMENT_FORWARD:
				this.moveForward();
				break;
		}
	}

	public void turnLeft(){
		String newOrientation = "";
		switch (this.position.getOrientation()){
			case Coordinate.NORTH:
				newOrientation = Coordinate.WEST;
				break;
			case Coordinate.EAST:
				newOrientation = Coordinate.NORTH;
				break;
			case Coordinate.SOUTH:
				newOrientation = Coordinate.EAST;
				break;
			case Coordinate.WEST:
				newOrientation = Coordinate.SOUTH;
				break;
		}
		if (!newOrientation.equals("")){
			this.position.setOrientation(newOrientation);
		}
	}

	public void turnRight(){
		String newOrientation = "";
		switch (this.position.getOrientation()){
			case Coordinate.NORTH:
				newOrientation = Coordinate.EAST;
				break;
			case Coordinate.EAST:
				newOrientation = Coordinate.SOUTH;
				break;
			case Coordinate.SOUTH:
				newOrientation = Coordinate.WEST;
				break;
			case Coordinate.WEST:
				newOrientation = Coordinate.NORTH;
				break;
		}
		if (!newOrientation.equals("")){
			this.position.setOrientation(newOrientation);
		}
	}

	public void moveForward(){
		Coordinate newPos = this.terrain.moveRover(this.position);
		if (newPos != null){
			this.position = newPos;
		}
	}

	public Coordinate getPosition(){
		return this.position;
	}

}
