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
	JButton orangutanbutton, w1b, w2b, cab,smb;

	public Window() {
		super("Window");
		setSize(1000, 700);
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
		orangutanbutton = new JButton("O1");

		// place the button "manually"
		orangutanbutton.setBounds((int) (400 - orangutanbutton.getPreferredSize().getWidth()) / 2, 0,
				(int) orangutanbutton.getPreferredSize().getWidth(), (int) orangutanbutton.getPreferredSize().getHeight());
		mainPanel.add(orangutanbutton);
		
		orangutanbutton.setLocation((int) (50 - orangutanbutton.getPreferredSize().getWidth() / 2),
				(int) (300 - orangutanbutton.getPreferredSize().getHeight() / 2));

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
				Game.floor.getOrangutan1().move(e.getX(), e.getY());
				/*
				orangutanbutton.setLocation((int) (e.getX() - orangutanbutton.getPreferredSize().getWidth() / 2),
						(int) (e.getY() - orangutanbutton.getPreferredSize().getHeight() / 2));*/

			}
		});
		
		//Gombok
		w1b = new JButton("02");
		w1b.setBounds((int) (400 - w1b.getPreferredSize().getWidth()) / 2, 0,
				(int) w1b.getPreferredSize().getWidth(), (int) w1b.getPreferredSize().getHeight());
		
		mainPanel.add(w1b);
		w1b.setLocation((int) (DrawRect.x15 - w1b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y15 - w1b.getPreferredSize().getHeight() / 2));
		w1b.setText("W1");

		w2b = new JButton("03");
		w2b.setBounds((int) (400 - w2b.getPreferredSize().getWidth()) / 2, 0,
				(int) w2b.getPreferredSize().getWidth(), (int) w2b.getPreferredSize().getHeight());
		
		mainPanel.add(w2b);
		w2b.setLocation((int) (DrawRect.x42 - w2b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y42 - w2b.getPreferredSize().getHeight() / 2));
		w2b.setText("W2");
		
		cab = new JButton("04");
		cab.setBounds((int) (400 - cab.getPreferredSize().getWidth()) / 2, 0,
				(int) cab.getPreferredSize().getWidth(), (int) cab.getPreferredSize().getHeight());
		
		mainPanel.add(cab);
		cab.setLocation((int) (DrawRect.x20 - cab.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y20 - cab.getPreferredSize().getHeight() / 2));
		cab.setText("CA");
		
		smb = new JButton("05");
		smb.setBounds((int) (400 - smb.getPreferredSize().getWidth()) / 2, 0,
				(int) smb.getPreferredSize().getWidth(), (int) smb.getPreferredSize().getHeight());
		
		mainPanel.add(smb);
		smb.setLocation((int) (DrawRect.x24 - smb.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y24 - smb.getPreferredSize().getHeight() / 2));
		smb.setText("SM");
		
		mainPanel.setFocusable(true);
		setVisible(true);
	};
	
	public void moveOrangutanButton(int x, int y) {
		orangutanbutton.setLocation((int) (x - orangutanbutton.getPreferredSize().getWidth() / 2),
				(int) (y - orangutanbutton.getPreferredSize().getHeight() / 2));
	}
	
}






