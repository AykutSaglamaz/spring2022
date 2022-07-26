package gun08_ternary;

import java.util.Scanner;

public class Ternary02 {
	//kullanicidan iki tam sayi (int) alin ve
	// kucuk olan sayi yazdirin
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen iki tam sayi giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//1. yol ==> if else
		if(a<b) {
			System.out.println("kucuk sayi: "+ a);
		}else {
			System.out.println("kucuk sayi: "+ b);
		}

		//2.yol ==> ternary
		
		int sonuc = a<b ? a : b;
		System.out.println("kucuk sayi: "+sonuc);
		
		
		
	}

}
