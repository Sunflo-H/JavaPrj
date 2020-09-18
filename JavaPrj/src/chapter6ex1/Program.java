package chapter6ex1;

public class Program {

	static int sum(int x, int y) {
		return x + y;
	}
	static String getName(int num, String str) {
		
		return str;
	}
	static void print(int i, float f, char c) {
		System.out.printf("%d,%.2f,%c\n",i,f,c);
	}
	
	static double print(boolean b , double d, char[][] cs) {
		
		return 2.2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =3,y=4;
		int result =sum(x,y);
		
		String s =getName(2,"hello");
		
		System.out.println(result);
		print(2,3.0f,'a');
		
		char[][] names = new char[3][10];
		double cnt = print(true,4.0,names);
		System.out.println(cnt);
	}
	
	

}
