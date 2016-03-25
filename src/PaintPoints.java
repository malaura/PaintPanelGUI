import java.awt.Color;

public class PaintPoints {
	
	private final int _x;
	private final int _y;	
	private final Color _color;
	private final int _size;	
	private final double a = Math.PI;
	

	
	public PaintPoints(int x, int y, Color color, int size) {
		_x = x;
		_y = y;
		_color = color;
		_size = size;
	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public Color getColor(){
		return _color;
	}
	
	public int getSize(){
		return _size;
	}
	
	
}
