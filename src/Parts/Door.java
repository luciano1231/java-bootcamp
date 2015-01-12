package Parts;
import java.util.Scanner;
public class Door extends Openings{
	private int width;
	private int hight;
	public Door() {
	}
	public Door(int width, int hight) {
		super(width, hight);	
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	@Override
	public Openings createOpening() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Door door=new Door();
		System.out.println("set the width for the door");
		door.width=input.nextInt();
		System.out.println("set the wight");
		door.hight=input.nextInt();
		return door;		
	}
	
}
