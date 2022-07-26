package gun15_loops_DoWhile;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		
		/*
		 *Kullanicidan bir integer alalim
		 *eger kullanicinin girmis oldugu integer cift ise console "kazandin"
		 * cift degilse, luften tekrar bir integer girin
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int sayi = 0;
		
		do {
			System.out.println("lutfen bir integer giriniz");
			
			 sayi =scan.nextInt();
			
		}while(sayi%2!=0);
		
		System.out.println("kazandin");
		
		
		
		
		
		
		
		
		
		
		

	}

}
