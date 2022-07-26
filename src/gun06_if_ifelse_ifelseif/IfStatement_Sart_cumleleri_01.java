package gun06_if_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement_Sart_cumleleri_01 {

	public static void main(String[] args) {
		// kullanicinda bir integer bu tek mi cift mi oldugunu soyle/yazdir
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Bir interger girin...");
//		
//		int num = scan.nextInt();
//		
//		if(num%2 == 0) {
//			System.out.println(num + ": cift sayidir");
//		}
//		
//		if (num%2 != 0) {
//			System.out.println(num + ": tek sayidir");
//		}
//		
		
		// kullanicidan bir integer al, bu sayinin negative olup olmadigini kontrol et
		
//		System.out.println("lutfen bir sayi giriniz!!!");
//		int sayi = scan.nextInt();
//		
//		if (sayi<0) {
//			System.out.println(sayi + ": negative bir sayidir");
//		
//		}
//		
//		if (sayi >= 0) {
//			System.out.println(sayi + ": negative bir sayi degildir");
//		}
//		
		// kullanicidan bir dikdortgenin yukseklik ve tabanlarini alalim
		// bu yukseklik ve taban birbirine esitse, konsole kare, esit degilse 
		//dikdortgen yazdiralim
		
		System.out.println("lutfen dikdortgen icin yukseklik ve taban giriniz");
		
		double y = scan.nextDouble();
		double t = scan.nextDouble();
		
		
		if(y<=0 || t<=0) {
			System.out.println("yukseklik ve taban sifir olmamali, positif bir deger girin");
		}
		if(y==t) {
			System.out.println("bu bir karedir");
			
		}
		
		if (y!=t) {
			System.out.println("bu bir dikdortgen");
		}
		
		
		
		
		
		}

}
