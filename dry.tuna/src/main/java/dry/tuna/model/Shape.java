package dry.tuna.model;

public class Shape {
	private int side;
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public int getArea() {
		return 0;
	}
	
	public int getParameter() {
		return this.side;
	}
}
