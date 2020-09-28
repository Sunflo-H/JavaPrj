package chapter7ex2;

import java.util.Random;

public class Program {

	public static void main(String[] args) {

		// 1. 알맹이 : 값을 가지는 그릇(개념단위의 그릇)-엔티티:개체
		// 2. 서비스 : 알맹이들을 가지고 있던지 가져오던지..해서 알맹이들을제공해주는 서비스
		// 3. 껍데기 : 사용자의 입력/출력을 도와주는 사용자 인터페ㅣ스

		// 알맹이
		// int[] lotto = new int[6];
		Lotto lotto = new Lotto(); //생성자
		//생성자 호출시 객체선언하게끔 만들었어
		//Lotto.init(lotto);
		//lotto.init();

//		 번호를 생성 gen  제너레이팅(생성)  -> Lotto.gen(lotto) -> Lotto.gen() 으로 바꿀수 있대 이게 객체지향을 지원하는 언어래
		//Lotto.gen(lotto);  //static method 기존의 메서드
		lotto.gen();	   //instance method
		
		//둘다 메소드긴 메소드인데 
		//lotto.gen은 좀 더 업그레이드 된거라 같은 메소드라 하기 좀그래 다른 
		//기존의 메서드와 분리하기 위해인스턴스 메서드라 한다
		//인스턴스 함수는 보다 사람에 맞게 직관적이다
		//lotto.gen = 로또를 생성! lotto가 주체
		//Lotto.gen(lotto) = 생성해! 로또를   생성이 주체
		// 사람은 명사가 주체여야 편하다
		
		// 로또 번호를 출력 print
		//Lotto.print(lotto);
		lotto.print();
		// 번호를 정렬 sort
		//Lotto.sort(lotto);
		lotto.sort();
		// 번호를 출력 print
		//Lotto.print(lotto);
		lotto.print();

	}
	

}