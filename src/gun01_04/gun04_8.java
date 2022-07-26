package gun01_04;

import java.util.Scanner;

public class gun04_8 {

	public static void main(String[] args) {
		// Kullanicidan bir saat deger al ve saniye olarak yazdir
		// 1 saniye = saat*60*60
		
		Scanner scan = new Scanner(System.in);
		System.out.println("saniyeye cevirmek icin lutfen bir saat degeri giriniz");
		
		long saat = scan.nextLong();
		
		System.out.println(saat*60*60+ " saniye");

	}

}
