import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FromWithSubmitButton extends Applet implements ActionListener {

	Label l1 = new Label("Enter name : ");
	Label l2 = new Label("Select Gender : ");
	Label l3 = new Label("Age : ");
	
	String name = "";
	String gender = "";
	String age = "";
			
	
	TextField t1 = new TextField();
	
	CheckboxGroup gp = new CheckboxGroup();
	
	Checkbox m = new Checkbox("Male", gp, true);
	Checkbox f = new Checkbox("FeMale", gp, false);
	
	
	Choice c = new Choice();
	Button b1 = new Button("Submit");
	
	public void init() {
		add(l1);
		add(t1);
		add(l2);
		add(m);
		add(f);
		add(l3);
		c.add("18");
		c.add("19");
		c.add("20");
		c.add("21");
		c.add("22");
		
		add(c);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		g.drawString("Name : " + name, 20, 120);
		g.drawString("Gender : " + gender, 20, 140);
		g.drawString("Age : " + age, 20, 160);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		name  = t1.getText();
		gender = gp.getSelectedCheckbox().getLabel();
		age = c.getSelectedItem();
		repaint();
	}

}
