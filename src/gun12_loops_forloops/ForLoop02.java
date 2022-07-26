package gun12_loops_forloops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		Asagidaki sartlar altinda kullanicidan ad ve soyadini girmesiniz isteyelim
		
		1) Eger kullanici ad-soyad dan once veya sonra bosluk kullanmis ise onu kaldirin (silin)
		2) Eger kullanici hicbir karakter veya sadece bosluk kullanmissa, kullaniciya "Kullandiginiz uygun bir karakter degildir"
		3) Eger kullanici ad ve soyad arasinda herhangi bir bosluk kullanmamissa, kullaniciya " ad veya soyad tan bir tanesini girmediniz"
		4) Eger kullanici ad ve soyad arasinda birden fazla bosluk kullanmissa, o bosluklari yalnizca bir tane indirelim
		5) Eger kullanici ad ve soyadini buyuk harfle baslatmamissa, ad ve soyad in ilk harflerini buyuk harf yapalim 
		 eger bu formata ad ve soyadini girmemisse bu duzeltelim
		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ad ve soyadinizi giriniz....");
		String adSoyad = scan.nextLine();
		
		//1. basamak
		adSoyad = adSoyad.trim();
		
		//2. basamak 
		
		if (adSoyad.isBlank()){
			System.out.println("Kullandiginiz uygun bir karakter degildir");
		}
		//3.basamak
		
		if(!adSoyad.contains(" ")) {
			System.out.println("ad veya soyad tan bir tanesini girmediniz");
		}
		
		//4.basamak ==>ali   can
		
		int BoslukIlkIndx = adSoyad.indexOf(" ");//3
		int BoslukSonIndx = adSoyad.lastIndexOf(" ");//5
		
	//	if(adSoyad.indexOf(" ")!=adSoyad.lastIndexOf(" ")) {
		
		if(BoslukIlkIndx  !=  BoslukSonIndx) {
						
			adSoyad = adSoyad.substring(0, BoslukIlkIndx)  + adSoyad.substring(BoslukSonIndx);
			
			System.out.println(adSoyad);
		}
		
	// 	5. basamak
		
		String duzenlenmisAd = "";
		String duzenlenmisSoyad = "";
		
		if(BoslukIlkIndx!=-1) {
			
			duzenlenmisAd =	adSoyad.substring(0, 1).toUpperCase() + adSoyad.substring(1, BoslukIlkIndx).toLowerCase();
			
			duzenlenmisSoyad = adSoyad.substring(BoslukIlkIndx+1, BoslukIlkIndx+2).toUpperCase() + adSoyad.substring(BoslukIlkIndx+2).toLowerCase();
		}
		 adSoyad = duzenlenmisAd + " " + duzenlenmisSoyad;
		 
		 System.out.println(adSoyad);
		
	

	}

}
