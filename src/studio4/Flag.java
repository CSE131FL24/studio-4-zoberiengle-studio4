package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.035);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(0,255,255);
		StdDraw.filledRectangle(0.5, 0.5, 0.5-0.035, 0.3-0.035);
		double [] x = {0.4,0.6,0.5};
		double []y= {0.45,0.45,0.6};
		
		StdDraw.setPenColor(255,255,51);
		StdDraw.filledPolygon(x, y);
		double []a= {0.5,0.6,0.4};
		double [] b = {0.4, 0.55, 0.55};
		StdDraw.filledPolygon(a, b);		
		StdDraw.setPenColor(255,51,255);
		Font Helvetica = new Font ("Helvetica", Font.BOLD ,60);
		StdDraw.setFont(Helvetica);
		StdDraw.text(0.5, 0.3, "EngleZoberiville");
		StdDraw.setPenColor(255,255,51);		
		double []g= {0.5-0.3,0.6-0.3,0.4-0.3};
		double [] f = {0.4, 0.55, 0.55};
		double [] i = {0.4-0.3,0.6-0.3,0.5-0.3};
		double []l= {0.45,0.45,0.6};
		StdDraw.filledPolygon(g, f);
		StdDraw.filledPolygon(i, l);
		
		double []p= {0.5+0.3,0.6+0.3,0.4+0.3};
		double [] o = {0.4, 0.55, 0.55};
		double [] c = {0.4+0.3,0.6+0.3,0.5+0.3};
		double []z= {0.45,0.45,0.6};
		StdDraw.filledPolygon(p, o);
		StdDraw.filledPolygon(c, z);
		
	}
}