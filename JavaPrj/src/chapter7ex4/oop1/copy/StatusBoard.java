package chapter7ex4.oop1.copy;

public class StatusBoard {

	private int myOmokColor;
	private int turnOmokColor;

	public void print() {
		
		char myOmokImg = '≒';
		char turnOmokImg ='≒';
		
		if(myOmokColor==1) 
			myOmokImg = '∞';
		
		
		if(turnOmokColor==1) 
			turnOmokImg ='∞';
		
		
		System.out.println("忙式式式式式式式式式式式式式式式式忖");
		System.out.printf("       My Omok %c\tturn %c\n", 
											myOmokImg, turnOmokImg);
		System.out.println("戌式式式式式式式式式式式式式式式式戎");
	}

	public void setMyOmokColor(int color) {
		this.myOmokColor = color;
	}

	public void setTurnOmokColor(int turnOmokColor) {
		this.turnOmokColor = turnOmokColor;
		
	}

	public int getMyOmokColor() {
		return myOmokColor;
	}

	public int getTurnOmokColor() {
		return turnOmokColor;
	}

}
