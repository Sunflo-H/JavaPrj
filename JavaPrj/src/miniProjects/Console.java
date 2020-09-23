package miniProjects;

import java.io.IOException;

public class Console {
	 public static void clear() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	public static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}
}
