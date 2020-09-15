import java.io.IOException;

public class Chapter4Ex6 {

	public static void main(String[] args) throws IOException {

		String s = Integer.toString(12);
		String a = String.valueOf(12);
		int x = Integer.parseInt("12");

		String name1 = "아이유";
		String name2 = "아이유";
		// String name2 = new String("아이유");

		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));

		String name3 = "hong";
		String name4 = name3.toUpperCase();
		System.out.println(name3 + ", " + name4);
		System.out.println("=================================");

		String fileName = "photo.jpg";
		System.out.println(fileName.length());
		System.out.println(fileName.indexOf(".")); // 5(인덱스는 0부터 시작)
		// 3번째 문자까지만 출력
		System.out.println(fileName.substring(0, 3)); // (인덱스 시작, 끝 인덱스-1)
		System.out.println("=================================");

		// 파일명만 출력하기
		String name = fileName.substring(0, fileName.indexOf("."));
		System.out.println(name);
		System.out.println("=================================");

		// 확장자만 출력하기
		String ext = fileName.substring(fileName.indexOf(".") + 1);
		System.out.println(ext);
		System.out.println("=================================");

		// 문자열 쪼개기
		String fileNames = "photo.jpg,aa.png,bb.gif,cc.png";// CSV
		String[] names = fileNames.split(",");
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println("=================================");

		
	}

}
