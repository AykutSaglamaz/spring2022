package gun08_ternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		// Kullanicidan yas ve cinsiyeti girmesini isteyin
		// eger yasi 65'ten buyuk ve cinsiyeti erkek ise "emekli" degilse "calismali" yadiralim
		//Eger yasi 60'tan buyuk ve cinsiyeti de kadin ise "emekli" degilse "calismali" yadiralim
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Yasinizi girin");
		int yas = scan.nextInt();
		System.out.println("Cinsiyetiniz nedir");
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		
		String sonuc = cinsiyet == 'E' ? (yas>65 ? "emekli" : "calismali"  ) : yas>60 ? "emekli" : "calismali"  ;
		System.out.println(sonuc);

	}

}
