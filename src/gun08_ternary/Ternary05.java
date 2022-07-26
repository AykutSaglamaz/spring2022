package gun08_ternary;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		// Kullanici bir sayi girmesini isteyin
		//eger sayi 10'dan kucuk ve 0'dan buyuk ve esit ise, bu sayinin bu sayinin kupunu alin
		// aksi durumda sayinin karesini alalim
		// kup = a*a*a      kare= a*a
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir int deger girin");
		int sayi=scan.nextInt();
		
//		String sonuc = sayi<10 && sayi>=0 ? ("kup:"+ (sayi*sayi*sayi)) : ("kare "+ (sayi*sayi));
		
			double sonuc =		(sayi<10 && sayi>=0 ? Math.pow(sayi, 3) : Math.pow(sayi, 2));
		
		System.out.println(sonuc);
		

	}

}
