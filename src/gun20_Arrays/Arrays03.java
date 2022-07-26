package gun20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

	/*
	 1) Uzunlugu ve Elementlerini kullanicidan alacaginiz bir String Array olusturun
	 2) Array in elementlerinde toplam kac karakter kulanildigini bulan bir java programi yaziniz
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Arrayin uzunlugunu giriniz");
		int uzunluk = scan.nextInt();
		String s[] = new String[uzunluk];
		
		System.out.println("String Arrayin elementlerini giriniz.");
		
		for(int i = 0; i<uzunluk; i++) {
			s[i] = scan.next();
		}
		System.out.println(Arrays.toString(s));

		int toplam = 0;

		for(int i =0; i<s.length; i++ ) {
			
			toplam = toplam + s[i].length();
	
		}
		
		System.out.println(toplam);
	}

}
