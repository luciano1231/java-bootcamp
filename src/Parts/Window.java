package Parts;
import java.util.Scanner;
public class Window extends Openings {
	private int width;
	private int hight;	
	public Window(int width, int hight) {
		super(width, hight);
		// TODO Auto-generated constructor stub
	}	
	public Window() {
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
		Scanner input=new Scanner(System.in);
		Window window=new Window();
		System.out.println("set the width for the window");
		window.width=input.nextInt();
		System.out.println("set the wight");
		window.hight=input.nextInt();
		return window;
	}
}
