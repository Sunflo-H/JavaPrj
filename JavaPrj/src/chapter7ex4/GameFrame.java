package chapter7ex4;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame {
	Canvas canvas;

	public GameFrame() {
		canvas = new Canvas();
		add(canvas);
	}
}
