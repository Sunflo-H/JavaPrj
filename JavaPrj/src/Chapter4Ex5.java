import java.io.IOException;

public class Chapter4Ex5 {

	public static void main(String[] args) throws IOException {

//		System.out.write(48);
//		System.out.flush();

		// write함수와 다르게 코드 값이 아니라 String으로 출력한다.
		// 48 > 52,56 -> '4','8'
		System.out.print(48);
		System.out.print(45);
		System.out.println();

		System.out.print("┌────────────────┐\n");
		System.out.print("│   2020-09-11   │\n");
		System.out.print("└────────────────┘\n");

		System.out.print("┌───────────────┐\n");
		System.out.println("│              2020-09-11             │");
		System.out.print("└───────────\t────┘");

	}

}
