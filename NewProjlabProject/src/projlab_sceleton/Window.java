package projlab_sceleton;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Window extends JFrame {
	private final JLabel statusBar;
	private final DrawRect mainPanel;
	private final JPanel statusBarPanel;
	JButton button;

	public Window() {
		super("Window");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		mainPanel = new DrawRect();
		
		mainPanel.setLayout(null);// no layout for absolute positioning
		statusBarPanel = new JPanel();
		statusBar = new JLabel("Coords: ");
		add(statusBarPanel, BorderLayout.SOUTH);
		add(mainPanel, BorderLayout.CENTER);
		mainPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		statusBarPanel.add(statusBar, BorderLayout.CENTER);
		button = new JButton("Default text");

		// place the button "manually"
		button.setBounds((int) (400 - button.getPreferredSize().getWidth()) / 2, 0,
				(int) button.getPreferredSize().getWidth(), (int) button.getPreferredSize().getHeight());
		mainPanel.add(button);

		mainPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(final MouseEvent e) {
				super.mouseMoved(e);
				statusBar.setText("Coords: (" + e.getX() + ":" + e.getY() + ")");
			}
		});

		mainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				super.mouseClicked(e);
				button.setLocation((int) (e.getX() - button.getPreferredSize().getWidth() / 2),
						(int) (e.getY() - button.getPreferredSize().getHeight() / 2));

			}
		});

		mainPanel.setFocusable(true);
		setVisible(true);
	};
	
}






