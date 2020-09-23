package training;

import java.io.IOException;
import java.util.Random;

public class EatOrNot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Random rand = new Random();

		System.out.println("º´ÁØÀÌÀÇ ¼±ÅÃÀº?! enter´­·¯ÁàÀ×");
		System.in.read();
		
		if(rand.nextInt(2)==0)
			System.out.println("¿Í¾Æ¾Ó ¸Ô¾î¶ó~!~!");
		else
			System.out.println("¸ÔÁö¸¶ ¤Ñ.¤Ñ");
		
		System.in.read();
	}

}
