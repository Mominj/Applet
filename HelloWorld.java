import java.awt.*;
import java.applet.*;

public class HelloWorld extends Applet{
	
	Font font = new Font("Times New Roman", Font.BOLD, 20);
	
	@Override
	public void paint(Graphics g) {
		
		// parameter 
		String s = this.getParameter("msg");
		// font
		g.setFont(font);
		g.drawString(s, 50, 20);
		//color
		g.setColor(Color.red);
		g.drawString(s + g.getFont() + "   " + g.getColor(), 520, 20);
		
		

	}
}