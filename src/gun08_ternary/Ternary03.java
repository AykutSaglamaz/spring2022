package gun08_ternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		//kullaniciya bir String girmesini isteyin
		// Eger bu String 2 karaktere sahip ise, sunucun "eyalet kisalmasi icin gecerli"
		//aksi durumda sonucun eyalet kisalmasi icin gecerli olmadigini yazdirin
		// orn FL  gecerli, FLF gecersiz, F=gecersiz
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir String giriniz");
		String a = scan.nextLine();
		
		String sonuc = (a.length()==2) ? (6>8? "kucuk": "buyuk") : "eyalet kisalmasi icin gecerli degil";
		
		System.out.println(sonuc);

	}

}
