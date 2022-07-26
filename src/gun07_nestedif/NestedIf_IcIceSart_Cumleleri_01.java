package gun07_nestedif;

import java.util.Scanner;

public class NestedIf_IcIceSart_Cumleleri_01 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya hem yas hem de cinsiyetini soralim
		 * eger yasi negatif ve cinsiyeti erkek ve kadindan farkli verirse bir hata mesaji verelim
		 * yasi 65'ten buyuk ve cinsiyeti de erkek ise "emekli", aksi halde "calismali"
		 * yasi 60'tan buyuk ve cinsiyeti kadin ise "emekli, aksi halde "calismali" yazdiralim
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("luften yasinizi giriniz ...");
		
		int yas = scan.nextInt();
		System.out.println("luften cinsiyetinizi giriniz ...");
		
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		
		
		// eger yasi negatif ve cinsiyeti erkek ve kadindan farkli verirse bir hata mesaji verelim
		if(yas<=0) {
			System.err.println("yas sifirdan buyuk olur, lutfen pozitif bir deger girin");
		}else if (!(cinsiyet=='E' || cinsiyet == 'K')) {
			System.err.println("Cinsiyeti lutfen Kadin ve Erkek olarak giriniz");
			
			// yasi 65'ten buyuk ve cinsiyeti de erkek ise "emekli", aksi halde "calismali"
		}else if (cinsiyet == 'E') {
			if(yas>65) {
				System.out.println("Emekli");
			}else {
				System.out.println("Calismali");
			}
			// yasi 60'tan buyuk ve cinsiyeti kadin ise "emekli, aksi halde "calismali"	
		}else if(cinsiyet == 'K') {
			if (yas>60) {
				System.out.println("Emekli");
			}else {
				System.out.println("Calismali");
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
