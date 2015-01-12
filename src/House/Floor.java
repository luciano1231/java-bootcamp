package House;
import java.util.Scanner;
import Parts.Room;
import Parts.Window;
public class Floor {
	private int number; // number of floor
	private Room[] room;
	private Window window;
	private int size;
	public Floor(int number, Room[] room, Window window, int size) {
		this.number = number;
		this.room = room;
		this.window = window;
		this.size = size;
	}	
	public Floor() {
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Room[] getRoom() {
		return room;
	}
	public void setRoom(Room[] room) {
		this.room = room;
	}
	public Window getWindow() {
		return window;
	}
	public void setWindow(Window window) {
		this.window = window;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) { // the sum of all the rooms in this floor
		for (int i =0; i < room.length;i++)
			this.size=this.size+room[i].getSize();		
	}
	public Floor createFloor(int numberOfFloor){
		Scanner input = new Scanner (System.in);
		System.out.println("This is the Floor number: "+numberOfFloor);		
		Floor floor=new Floor();
		floor.setNumber(numberOfFloor);		
		System.out.println("how many rooms have this floor?:");
		int nRooms= input.nextInt();
		for (int i =0;i < nRooms;i ++){ // create n rooms
			Room room = new Room();
			room.createARoom();
			this.room[i]= room;
			}		
		return floor;
	}
}
