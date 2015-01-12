package House;
import Parts.Window;
import java.util.Scanner;
public class CreateMyHouseApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Lets create your house!");
		System.out.println("How many floors will have your house?");
		int numFloor= input.nextInt();
		House myHouse=new House();
		Floor[] floor=new Floor[numFloor];
		System.out.println("set the size of theyard in square meters: ");
		int yardSize= input.nextInt();
		Yard yard= new Yard(yardSize);
		myHouse.setYard(yard); // set a yard for my house
		System.out.println(floor.length);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//Window winBethroom= new Window();
		//winBethroom.createOpening();
		

	}

}
