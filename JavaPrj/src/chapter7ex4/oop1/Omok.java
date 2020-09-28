package chapter7ex4.oop1;

public class Omok {
	private int color; // 얘랑 this.color은 다른거야 this는 메인함수에서 만들어진 객체야
	private int x;
	private int y;

	public Omok() {
		this.color = 0; // black color

	}

	public void print() {
		switch (color) {
		case 0:
			System.out.println("●");
			break;
		case 1:
			System.out.println("○");
			break;
		}

	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
