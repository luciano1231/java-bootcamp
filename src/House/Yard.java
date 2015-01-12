package House;
import java.util.Scanner;
public class Yard {
	Scanner input = new Scanner(System.in);
	private int size; // size in square meters

	public Yard(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public Yard createYard(){
		System.out.println("set the size of the yard in square meters: ");
		int yardSize= input.nextInt();
		Yard yard= new Yard(yardSize);
		System.out.println("Now your yard have:  "+this.getSize()+" square meters");
		return yard;
	}
}
