package gun15_loops_DoWhile;

import java.util.Scanner;

public class ContinueVeBreak {

	public static void main(String[] args) {
		/*
		 continue ==> bir loop icerinde istedigimiz bazi sayilari atlamak istedigimiz "continue" kullaniriz
		 
		 break ==> bir loop icerisinde "break" kullandigimizda loop(dongu) u bitirir, bizi onun disina atar
		 */
		
		/*
		 1'den 10'a kadar olan sayilari 7 ve 9 haric yazdiralim
		 */
		for(int i =1;  i<11; i++) {
			if(i==7 || i==9 ) {
				continue;
			}
		System.out.print(i + " ");
		}
		
		
		System.out.println();
		/*
		 Kullanicidan bir integer girmesini isteyelim ve yazdiralim
		 kullaniciya 11'e kadar olan integerlari girince kadar devam diyelim
		 */
		
		Scanner scan = new Scanner(System.in); 
		
		do {
			System.out.println("Lutfen bir integer giriniz");
			int sayi = scan.nextInt();
			
			if(sayi>=12) {
				break;
			}else {
				System.out.println(sayi + " ");
			}
			
		}while(true);
		
		System.out.println("Mayina bastiniz, oyun bitti");
		
		
		

		
		
		
		
	}

}
