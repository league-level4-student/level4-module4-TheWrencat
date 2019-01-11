package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public void update() {
		Random r = new Random();
		Random rr = new Random();
		int eh = r.nextInt(3);
		int he = rr.nextInt(3);
		setX(eh);
		setY(he);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}