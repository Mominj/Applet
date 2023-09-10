import java.applet.Applet;
import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTwoNumberWithApplet extends Applet implements ActionListener {

	
	int v1,v2,sum=0;
	
	TextField t1  = new TextField();
	TextField t2  = new TextField();
	
	Label l1 = new Label("value 1 : ");
	Label l2 = new Label("value 2 : ");
	
	Button b1 = new Button("ADD");
	
	public void init() {
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		
		b1.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString("sum is : " + sum, 50, 50);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		v1 = Integer.parseInt(t1.getText());
		v2 = Integer.parseInt(t2.getText());
		sum = v1+v2;
		
		repaint();
	}

}
