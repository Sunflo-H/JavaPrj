
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int a = 36;
		int b = 92;
		
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		while (b > 0) {
			int tmp = b;
			b = a%b;
			a = tmp;			
		}
		System.out.println(a);

	}

}
