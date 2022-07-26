package gun08_ternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		// Kullanicidan bir integer (tamsayi) alin 
		// eger kullanici 3 basakmali bir sayi girerse, console "bu 3 basamakli bir sayidir"
		// aksi console "bu 3 basamakli bir sayi degildir" yazdiralim
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir integer girin");
		int x =scan.nextInt();
		int y =Math.abs(x);
		
		String sonuc = y>99 && y<1000 ? (x + " sayisi 3 basamakli bir sayidir" )  :  x + " sayisi 3 basamakli bir sayi degildir ";
		
		System.out.println(sonuc);
		
		
		

	}

}
