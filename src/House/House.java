package House;
import java.util.Scanner;
public class House {
	private Floor[] floor;
	private Yard yard;
	private String adress;
	private int meters; //square meters
	private int terrainSize;//size of the terrain house+yard
	public House(Floor[] floor, Yard yard, String adress, int meters,
			int terrainSize) {
		this.floor = floor;
		this.yard = yard;
		this.adress = adress;
		this.meters = meters;
		this.terrainSize = terrainSize;
	}	
	public House() {
	}

	public Floor[] getFloor() {
		return floor;
	}
	public void setFloor(Floor[] floor) {
		this.floor = floor;
	}
	public Yard getYard() {
		return yard;
	}
	public void setYard(Yard yard) {
		this.yard = yard;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getMeters() {
		return meters;
	}
	public void setMeters(int meters) {
		this.meters = meters;
	}
	public int getTerrainSize() {
		return terrainSize;
	}
	public void setTerrainSize(int terrainSize) {
		this.terrainSize = terrainSize;
	}
	
	
	
}
