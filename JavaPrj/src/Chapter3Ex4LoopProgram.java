
public class Chapter3Ex4LoopProgram {

	public static void main(String[] args) {

		// 10번 반복하는 코드 블록을 만들어 주세요
		// for문 예제
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// 문제 1. 0 ~ 9 >> 1 ~ 10
		// 문제 2. 10 ~ 1
		// 문제 3. 1 ~ 51 ~ 5
		System.out.println();
		System.out.println("=====문제  1=====");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		System.out.println();
		System.out.println("=====문제  2=====");
		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}

		System.out.println();
		System.out.println("=====문제  3=====");
		for (int i = 0; i < 10; i++) {
			System.out.println(i % 5 + 1);
		}

	}

}
