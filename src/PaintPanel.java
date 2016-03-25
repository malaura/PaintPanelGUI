import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel{

	
	private final ArrayList<PaintPoints> _points;  //creates ArrayList with points
	private Color _currentcolor;
	private int _currentsize;

	
	//set up GUI and register mouse event handler
	public PaintPanel(){
		_points = new ArrayList<>(); //new array list that stores points, color and size
		_currentsize = 10; //'small' size as default
		
		
		
		//Paints when the mouse is clicked
		addMouseListener (new MouseAdapter() { //handles frame mouse motion event
			public void mousePressed(MouseEvent event)
				{	_points.add(new PaintPoints(event.getX(), event.getY(), _currentcolor, _currentsize));  //adds the event to the list
					repaint();
				}
		});
		
		//Paints when the mouse is dragged
		addMouseMotionListener ( new MouseMotionAdapter() { //handles frame mouse motion event
				public void mouseDragged (MouseEvent event)
					{	_points.add(new PaintPoints(event.getX(), event.getY(), _currentcolor, _currentsize)); //adds the event to the list
						repaint();
					}
				
		});
	}
				
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); //clears drawing area
		//draws all points in array
		for(PaintPoints p : _points){
	        g.setColor(p.getColor());
			int _currentSize = p.getSize();
			int halfPointSize = _currentSize / 2;
			g.fillOval(p.getX()- halfPointSize, p.getY() - halfPointSize, _currentSize, _currentSize);
				
		}
	}


	//sets the color to the one assigned by the button
	public void setColor(Color color) {
        _currentcolor = color;
       
	}
	
	//sets the size to the one assigned by the button
	public void setSize(int size) {
       _currentsize = size;
        
	}
	
	//clears the panel
    public void clear() {
        _points.clear();
        repaint();

    }
	
		
	}

