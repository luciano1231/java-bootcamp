package Parts;

public abstract class Openings {
	private int width;
	private int hight;
	public Openings(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}
	public Openings() {
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
	public String toString(){
		return "Size: Width: "+this.getWidth()+", Hight: "+this.getHight();
	}
	public abstract Openings createOpening();

}
