package chapter7ex4.oop1;

public class Program {

	public static void main(String[] args) {
		OmokBoard omokBoard = new OmokBoard();
		StatusBoard statusBoard = new StatusBoard();
		OmokBowl bowl = new OmokBowl();
		
		
		int x, y;
		
		int turnIndex = 0;
		
		// 초기 기본화면 출력
		omokBoard.print();
		statusBoard.print();
		bowl.print();
		
		
		
		
	}

}
