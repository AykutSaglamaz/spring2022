package gun05;

import java.util.Scanner;

public class Ders4_modulus {
	
	public static void main(String[] args) {
		 // modulus operator => %
		// 25%4=> 1
		
		System.out.println(25%4);
		
		System.out.println(25%10);
		
		//Kullanicidan bir sayi al ve bunun son rakamini yazdir
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Lutfen bir sayi giriniz");
//		
//		int sayi = scan.nextInt();
//		
//		System.out.println("degerin son basamigi: "+sayi%100);
//		
		
		// Kullanicidan bir 3 rakamli sayi al ve bu sayilarin toplamini yazdir
		//257=> 2+5+7=14
		
		int ucBasamakliSayi=0;
		int sonRakam =0;
		int ortaRakam =0;
		int ilkRakam =0;
		
		System.out.println("Lutfen 3 basakli bir sayi giriniz");
		
		ucBasamakliSayi = scan.nextInt();
		
		sonRakam = ucBasamakliSayi%10;//Son rakam
		
		ucBasamakliSayi =ucBasamakliSayi/10;
		
		ortaRakam= ucBasamakliSayi%10;//
		
		ucBasamakliSayi = ucBasamakliSayi/10;
		
		ilkRakam =ucBasamakliSayi%10;
		
		System.out.println(ilkRakam+ortaRakam+sonRakam);
		
		
		
		
		
		
		
		
		
		
		
	}

}
