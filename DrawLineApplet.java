import java.applet.*;
import java.awt.*;

public class DrawLineApplet extends Applet{
	public void paint(Graphics g) {
		g.drawLine(20, 20, 200, 20);
		g.drawLine(20, 20, 20, 200);
		g.drawLine(200, 20, 20, 200);
		
		// reactangle
		g.setColor(Color.red);
		g.fillRect(20, 400, 200, 40);
		
		//oval
		g.setColor(Color.green);
		g.drawOval(200, 400, 200, 200);
		
		//polygon
		g.setColor(Color.BLUE);
		int x[] = {300, 330, 270};
		int y[] = {200, 260,260 };
		g.drawPolygon(x, y, 3);
	}
}