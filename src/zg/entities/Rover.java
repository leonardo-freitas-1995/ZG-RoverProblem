package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class Rover {

	private Coordinate position;
	private Terrain terrain;

	public void sendRoverToTerrain(Terrain terrain, Coordinate startPos){
		this.terrain = terrain;
		this.position = startPos;
	}

	public void makeMovement(String movement){
		switch (movement){
			case "L":
				this.turnLeft();
				break;
			case "R":
				this.turnRight();
				break;
			case "M":
				this.moveForward();
				break;
		}
	}

	public void turnLeft(){
		String newOrientation = "";
		switch (this.position.getOrientation()){
			case "N":
				newOrientation = "W";
				break;
			case "E":
				newOrientation = "N";
				break;
			case "S":
				newOrientation = "E";
				break;
			case "W":
				newOrientation = "S";
				break;
		}
		if (!newOrientation.equals("")){
			this.position.setOrientation(newOrientation);
		}
	}

	public void turnRight(){
		String newOrientation = "";
		switch (this.position.getOrientation()){
			case "N":
				newOrientation = "E";
				break;
			case "E":
				newOrientation = "S";
				break;
			case "S":
				newOrientation = "W";
				break;
			case "W":
				newOrientation = "N";
				break;
		}
		if (!newOrientation.equals("")){
			this.position.setOrientation(newOrientation);
		}
	}

	public void moveForward(){
		this.position = this.terrain.moveRover(this.position);
	}

}
