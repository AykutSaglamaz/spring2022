package gun19_staticAnahtarKavrami;

import java.util.Scanner;

public class OgrenciKosturma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		do {
			
	
		System.out.println("Isminizi giriniz");
		String ad = scan.next();
		
		System.out.println("Soyisminizi giriniz");
		String soyisim = scan.next();
		String isim = ad + " "+ soyisim;
		
		System.out.println("Sinifinizi giriniz");
		int sinif = scan.nextInt();
		
		System.out.println("Kayit yilini giriniz");
		int kayitYili = scan.nextInt();
		

		Ogrenciler ogr1 = new Ogrenciler(isim, sinif, kayitYili);
		
		System.out.println("Ogrenci Ad-Soyadi: " + ogr1.isim);
		
		System.out.println("Ogrenci Sinifi: " + ogr1.sinif);
		System.out.println("Ogrenci kayit yili: " + ogr1.kayitYili);
		System.out.println("Ogrenci Okul No: " + Ogrenciler.okulNo);
		
		System.out.println("Yeni ogrenci kaydetmek istiyorsaniz Y, istemiyorsaniz N basin");
		
		String cikis = scan.next().toUpperCase();
		
		if (cikis.equals("N")) {
			break;
			
		}
		
		
		
		}while(true);
		
		System.out.println("tesekkurler ogrenciler kaydettiniz");
		
		scan.close();
		
	
		

	}

}
