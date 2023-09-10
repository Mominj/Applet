import java.applet.*;
import java.awt.*;

public class ButtonApplet extends Applet{

	Button b1 = new Button("SUBMIT");
	Button b2 = new Button("RESET");

	TextField t1 = new TextField("Hello", 25);
	TextField t2 = new TextField();
	
	Choice city = new Choice();
	
	public void init() {
		
		add(b1);
		add(b2);
		
		t2.setText("test text");
		add(t1);
		add(t2);
		
		city.addItem("dhaka");
		city.addItem("khuna");
		city.addItem("ctg");
		city.addItem("barisal");
		city.addItem("rajshahi");
		
		add(city);
	}
	public void paint(Graphics g) {
		g.drawString("RESUT " + city.getSelectedItem(), 20 ,20 );
	}
	
}
