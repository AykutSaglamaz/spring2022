package gun15_loops_DoWhile;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan tlf icin bir sifre girmesini isteyin
		 eger sifre 6 karakter veya 6 karakterden daha uzun ise, 'sifre gecerli' 
		 eger sifre 6 karakterden kisa ise 'lutfen 6 karakter veya daha uzun bir karakter giriniz' ve tekrardan sifre girmesini isteyin
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String sifre ="";
		
		do {
			System.out.println("lutfen Sifrenizi giriniz");
			sifre= scan.nextLine();
			
			if(sifre.length()<6) {
				System.out.println("lutfen 6 karakter veya daha uzun bir karakter giriniz");
			}
			
		}while(sifre.length()<6);
		System.out.println("girdiginiz sifre gecerli");
		
		
		
		
		
		
		
		
		
		

	}

}
