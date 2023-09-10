import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventApplet extends Applet implements ActionListener {

	Button b1= new Button("ok");
	Button b2 = new Button("Cancel");
	String s = "";
	int count = 0;
	public void init() {
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString(s, 200, 200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String st = e.getActionCommand();
		if(st.equals("ok")) {
			s = "Button 1 clicked ";
		} 
		if (st.equals("Cancel")) {
			s = "Button 2 clicked ";
		}
		repaint();
		
		
	}
  
}
