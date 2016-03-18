package dry.tuna.model;

public class Circle extends Shape{
	public int getArea() {
		return super.getSide() * super.getSide() * (int)Math.PI;
	}
	
	public int getParameter() {
		return super.getSide() * 2 * (int)Math.PI;
	}
}
