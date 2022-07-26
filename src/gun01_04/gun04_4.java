package gun01_04;

import java.util.*;

public class gun04_4 {

	public static void main(String[] args) {
		// kullanicidan bir kare seklinde bir bahcenin bir kenarini isteyelim
		//  bahcenin cevresini hesap a=>4*a
		//bahcenin alani a=> a*a
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin bir kenarini girer misiniz");
		double kenar = scan.nextDouble();
		
		System.out.println("Bahcenin cevresi :" + 4*kenar);
		
		System.out.println("Bahcenin alani :" + kenar*kenar);
		
		

	}

}
