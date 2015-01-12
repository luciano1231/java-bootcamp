package Parts;
import java.util.Scanner;
public class Room {
	private String name;
	private int size; //the size of a room in square meters
	private Window[] wind;
	private Bathroom bath;
	public Room(String name, Window[] wind, Bathroom bath) {
		this.name=name;
		this.wind = wind;
		this.bath = bath;
	}	
	public Room() {
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Window[] getWind() {
		return wind;
	}
	public void setWind(Window[] wind) {
		this.wind = wind;
	}
	public Bathroom getBath() {
		return bath;
	}
	public void setBath(Bathroom bath) {
		this.bath = bath;
	}
	public Room createARoom(){
		Scanner input = new Scanner(System.in);
		Room room= new Room();
		System.out.println("Lets create the Room! \n First, which room is it?");
		this.name=input.next();// String for the name of the room
		System.out.println("please set the size (in square meters) ");
		this.size=input.nextInt();	
	
		System.out.println("");
		return room;
	}	
}
