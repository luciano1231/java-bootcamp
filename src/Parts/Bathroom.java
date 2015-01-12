package Parts;
public class Bathroom {
	private int size;
	private Window wndw;
	public Bathroom(int size, Window wndw) {
		this.size = size;
		this.wndw = wndw;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Window getWndw() {
		return wndw;
	}
	public void setWndw(Window wndw) {
		this.wndw = wndw;
	}
	
}
