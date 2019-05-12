package projlab_sceleton;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Window extends JFrame {
	private final JLabel statusBar;
	private final DrawRect mainPanel;
	private final JPanel statusBarPanel;
	JButton orangutanbutton, w1b, w2b, cab,smb,acb, sp1b, lp1b, hp1b, sp2b, lp2b, hp2b, o2b ;
	private List<JButton> pandabuttons = new ArrayList<JButton>();

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
		w1b = new JButton("W1");
		w1b.setBounds((int) (400 - w1b.getPreferredSize().getWidth()) / 2, 0,
				(int) w1b.getPreferredSize().getWidth(), (int) w1b.getPreferredSize().getHeight());
		
		mainPanel.add(w1b);
		w1b.setLocation((int) (DrawRect.x15 - w1b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y15 - w1b.getPreferredSize().getHeight() / 2));
		

		w2b = new JButton("W2");
		w2b.setBounds((int) (400 - w2b.getPreferredSize().getWidth()) / 2, 0,
				(int) w2b.getPreferredSize().getWidth(), (int) w2b.getPreferredSize().getHeight());
		
		mainPanel.add(w2b);
		w2b.setLocation((int) (DrawRect.x42 - w2b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y42 - w2b.getPreferredSize().getHeight() / 2));
		
		cab = new JButton("CA");
		cab.setBounds((int) (400 - cab.getPreferredSize().getWidth()) / 2, 0,
				(int) cab.getPreferredSize().getWidth(), (int) cab.getPreferredSize().getHeight());
		
		mainPanel.add(cab);
		cab.setLocation((int) (DrawRect.x20 - cab.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y20 - cab.getPreferredSize().getHeight() / 2));
		
		smb = new JButton("SM");
		smb.setBounds((int) (400 - smb.getPreferredSize().getWidth()) / 2, 0,
				(int) smb.getPreferredSize().getWidth(), (int) smb.getPreferredSize().getHeight());
		
		mainPanel.add(smb);
		smb.setLocation((int) (DrawRect.x24 - smb.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y24 - smb.getPreferredSize().getHeight() / 2));
		
		acb = new JButton("AC");
		acb.setBounds((int) (400 - acb.getPreferredSize().getWidth()) / 2, 0,
				(int) acb.getPreferredSize().getWidth(), (int) acb.getPreferredSize().getHeight());
		
		mainPanel.add(acb);
		acb.setLocation((int) (DrawRect.x37 - acb.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y37 - acb.getPreferredSize().getHeight() / 2));
		
		sp1b = new JButton("SP1");
		sp1b.setBounds((int) (400 - sp1b.getPreferredSize().getWidth()) / 2, 0,
				(int) sp1b.getPreferredSize().getWidth(), (int) sp1b.getPreferredSize().getHeight());
		
		mainPanel.add(sp1b);
		sp1b.setLocation((int) (DrawRect.x9 - sp1b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y9 - sp1b.getPreferredSize().getHeight() / 2));
		
		
		lp1b = new JButton("LP1");
		lp1b.setBounds((int) (400 - lp1b.getPreferredSize().getWidth()) / 2, 0,
				(int) lp1b.getPreferredSize().getWidth(), (int) lp1b.getPreferredSize().getHeight());
		
		mainPanel.add(lp1b);
		lp1b.setLocation((int) (DrawRect.x18 - lp1b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y18 - lp1b.getPreferredSize().getHeight() / 2));
		
		

		hp1b = new JButton("HP1");
		hp1b.setBounds((int) (400 - hp1b.getPreferredSize().getWidth()) / 2, 0,
				(int) hp1b.getPreferredSize().getWidth(), (int) hp1b.getPreferredSize().getHeight());
		
		mainPanel.add(hp1b);
		hp1b.setLocation((int) (DrawRect.x25 - hp1b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y25 - hp1b.getPreferredSize().getHeight() / 2));
		
		
		

		sp2b = new JButton("SP2");
		sp2b.setBounds((int) (400 - sp2b.getPreferredSize().getWidth()) / 2, 0,
				(int) sp2b.getPreferredSize().getWidth(), (int) sp2b.getPreferredSize().getHeight());
		
		mainPanel.add(sp2b);
		sp2b.setLocation((int) (DrawRect.x30 - sp2b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y30 - sp2b.getPreferredSize().getHeight() / 2));
		
		
		lp2b = new JButton("LP2");
		lp2b.setBounds((int) (400 - lp2b.getPreferredSize().getWidth()) / 2, 0,
				(int) lp2b.getPreferredSize().getWidth(), (int) lp2b.getPreferredSize().getHeight());
		
		mainPanel.add(lp2b);
		lp2b.setLocation((int) (DrawRect.x31 - lp2b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y31 - lp2b.getPreferredSize().getHeight() / 2));
		
		

		hp2b = new JButton("HP2");
		hp2b.setBounds((int) (400 - hp2b.getPreferredSize().getWidth()) / 2, 0,
				(int) hp2b.getPreferredSize().getWidth(), (int) hp2b.getPreferredSize().getHeight());
		
		mainPanel.add(hp2b);
		hp2b.setLocation((int) (DrawRect.x36 - hp2b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y36 - hp2b.getPreferredSize().getHeight() / 2));
		
		o2b = new JButton("O2");
		o2b.setBounds((int) (400 - o2b.getPreferredSize().getWidth()) / 2, 0,
				(int) o2b.getPreferredSize().getWidth(), (int) o2b.getPreferredSize().getHeight());
		
		mainPanel.add(o2b);
		o2b.setLocation((int) (DrawRect.x35 - o2b.getPreferredSize().getWidth() / 2),
				(int) (DrawRect.y35 - o2b.getPreferredSize().getHeight() / 2));
		
		pandabuttons.add(sp1b);
		pandabuttons.add(lp1b);
		pandabuttons.add(hp1b);
		pandabuttons.add(sp2b);
		pandabuttons.add(lp2b);
		pandabuttons.add(hp2b);
		pandabuttons.add(o2b);
	
		mainPanel.setFocusable(true);
		setVisible(true);
	};
	
	public void moveOrangutanButton(int x, int y) {
		orangutanbutton.setLocation((int) (x - orangutanbutton.getPreferredSize().getWidth() / 2),
				(int) (y - orangutanbutton.getPreferredSize().getHeight() / 2));
	}
	public void pandaButtons() {
		List<Panda> pandas = new ArrayList<Panda>();
		pandas = Game.floor.getPandas();
		for (int i = 0; i < pandas.size(); i++) {
			Panda p = pandas.get(i);
			if (p != null && pandabuttons.get(i) != null ) {
				pandabuttons.get(i).setLocation((int) (p.getTile().getX() - pandabuttons.get(i).getPreferredSize().getWidth() / 2),
						(int) (p.getTile().getY() - pandabuttons.get(i).getPreferredSize().getHeight() / 2));
			}else {
				mainPanel.remove(pandabuttons.get(i));
				
			}
		}
	}
	
}






