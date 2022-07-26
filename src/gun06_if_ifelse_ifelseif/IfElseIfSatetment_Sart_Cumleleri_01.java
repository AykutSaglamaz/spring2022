package gun06_if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfSatetment_Sart_Cumleleri_01 {

	public static void main(String[] args) {
		/*
		 kulanicidan bir sayi al, 
		 eger bu sayi sifirdan (0) kucuk "negatif",
		 eger bu sayi sifirdan buyuk ise "pozitif",
		 eger bu sayi sifira esit ise 'Notr' olarak yazdir
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		if(sayi<0) {
			System.out.println(sayi + ": negatif bir sayidir");
			
		}else if(sayi>0) {
			System.out.println(sayi + ": pozitif bir sayidir");
		}else {
			System.out.println(sayi + ": notr bir sayidir");
		}
		
		
	}

}
