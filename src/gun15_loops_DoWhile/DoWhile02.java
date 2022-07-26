package gun15_loops_DoWhile;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan adini girmesini isteyelim
		 * eger kullanicinin girmis oldugu adinin bas harfi kucuk harf ise, kullaniciya 'luften ilk harfi buyuk girin' diyelim
		 * eger kullanici adinin bas harfi buyuk harf girerse, 'basardin' mesaji verelim
		 */

		Scanner scan = new Scanner(System.in);

		char ilkHarf = '@';
		
		do {
			System.out.println("lutfen adinizi giriniz");

			 ilkHarf = scan.next().charAt(0);
			 
			 if(ilkHarf>='a' && ilkHarf<='z') {
				 System.err.println("luften ilk harfi buyuk olan bir ad girin");	 
			 	}
		}while(ilkHarf>='a' && ilkHarf<='z');
		
		System.out.println("basardin");
		
		
		
		
		
	}

}
