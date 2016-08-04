package zg.entities;

/**
 * Created by Leonardo on 04/08/2016.
 */
public class CircleTerrain extends Terrain {

	private final int radius;

	public CircleTerrain(int radius) {
		this.radius = radius;
	}

	@Override
	public Coordinate moveRover(Coordinate pos) {
		return null;
	}
}
