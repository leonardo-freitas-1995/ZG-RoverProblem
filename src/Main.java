import zg.entities.Coordinate;
import zg.entities.RectangleTerrain;
import zg.entities.Rover;
import zg.entities.Terrain;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static int totalRovers = 2;

	public static void useRectangleScenario(){
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		Rover rover;
		Terrain terrain = new RectangleTerrain(x, y);
		for (int i = 0; i < totalRovers; i++){
			rover = new Rover();
			String coord = sc.nextLine();
			rover.sendToTerrain(terrain, new Coordinate(coord, Coordinate.RECTANGLE_COORDINATE));
			String movements = sc.nextLine();
			for (String m : movements.split("")){
				rover.makeMovement(m);
			}
			System.out.println(rover.getPosition());
		}
	}

	public static void main(String[] args) {
		useRectangleScenario();
	}
}
