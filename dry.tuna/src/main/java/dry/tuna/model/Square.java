package dry.tuna.model;

public class Square extends Shape{
	public int getArea() {
		return super.getSide() * super.getSide();
	}
	
	public int getParameter() {
		return super.getSide() << 2;
	}
}
