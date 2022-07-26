package gun15_loops_DoWhile;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir integer girmesini isteyin
		 Eger bu integer 5 ile bolunebiliyorsa, kullaniciya "kazandin"
		 Eger bu integer 5 ile bolunmuyorsa, "kaybettin" yazdirin 
		 kullaniciya tekrar oynamak isteyip istemedigini soralim
		 eger oynamak istiyorsa bir sayi girmesini isteyelim, istemiyorsa "tesekkurler" diye mesaj verelim
		 */
		
		Scanner scan = new Scanner(System.in);
		int sayi =0;
		
		do {
			System.out.println("Lutfen bir integer giriniz");
			sayi = scan.nextInt();
			
			if(sayi%5==0) {
				System.out.println("kazandin");	
			}else {
				System.out.println("kaybettin");
			}
			System.out.println("devam etmek istiyorsan bir integer girin, bitirmek istiyorsan Q basin");
			char devam =scan.next().toUpperCase().charAt(0);
			
			if(devam=='Q') {
				break;
			}
			
		}while(true);
		System.out.println("tesekkurler, tekrar bekleriz");
		
		
		
		
		
		
		
		

	}

}
