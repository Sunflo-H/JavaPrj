package chapter4ex5;

public class Program {

	static int sum(int n ) {
		
		if(n==1)
			return 3;
		int an = (3+(n-1)*7);
		
		return sum(n-1)+an;
	}
	//s(n) = s(n-1)+(3+(n-1)*7)
	static int sum2(int n) {
		if(n==1)
			return 3;
		
		return sum(n-1)+(3+(n-1)*7);
	}
	public static void main(String[] args) {

		int sum=sum(2);
		System.out.println(sum);
	}

}
