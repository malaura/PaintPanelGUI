import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private final PaintPanel _panel;
	private final JButton _blackColor;
	private final JButton _black2Color;
	private final JButton _blueColor;
	private final JButton _greenColor;
	private final JButton _yellowColor;
	private final JButton _smallSize;
	private final JButton _mediumSize;
	private final JButton _largeSize;
	private final JButton _clear;

	
	public MainFrame() {
		super("Paint Panel");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Use BorderLayout so that the panel is stretched to fill the window.
		setLayout(new BorderLayout());
		
		_panel = new PaintPanel();
		add(_panel, BorderLayout.CENTER);
		
		
		// Creates black Color button
		_blackColor = new JButton("Orange");
		_blackColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setColor(Color.ORANGE);
			}
			
		});
		
		// Creates blue Color button
		_blueColor = new JButton("Magenta");
		_blueColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setColor(Color.MAGENTA);
			}
			
		});
		
		// Creates green Color button
		_greenColor = new JButton("cyan");
		_greenColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setColor(Color.CYAN);
			}
			
		});
		
		
		// Creates brown Color button
		_black2Color = new JButton("Black");
		_black2Color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setColor(Color.BLACK);
			}
			
		});
		
		
		// Creates yellow Color button
		_yellowColor = new JButton("Yellow");
		_yellowColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setColor(Color.yellow);
			}
			
		});
		
		
		// Creates Color Panel
		JPanel colorPanel = new JPanel(new GridLayout(4, 1)); //(int rows, int cols)
		colorPanel.add(_blackColor);
		colorPanel.add(_black2Color);
		colorPanel.add(_blueColor);
		colorPanel.add(_greenColor);
		colorPanel.add(_yellowColor);

		add(colorPanel, BorderLayout.WEST);  //adds colorPanel to the panel 
		
		
		// Creates small Size button
		_smallSize = new JButton("Small");
		_smallSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setSize(10);
			}
			
		});
		
		// Creates medium Size button
		_mediumSize = new JButton("Medium");
		_mediumSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setSize(50);
			}
			
		});
		
		// Creates large Size button
		_largeSize = new JButton("Large");
		_largeSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.setSize(100);
			}
			
		});
		
		// Creates clear button
		_clear = new JButton("Clear");
		_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_panel.clear();
			}
			
		});


		// Creates Size + Clear Panel
		JPanel sizePanel = new JPanel(new GridLayout(4, 1));  //(int rows, int cols)
		sizePanel.add(_smallSize);
		sizePanel.add(_mediumSize);
		sizePanel.add(_largeSize);
		sizePanel.add(_clear);


		add(sizePanel, BorderLayout.EAST); //adds sizePanel to the panel 

		setSize(800, 600);
		
	}
}