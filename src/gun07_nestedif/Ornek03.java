package gun07_nestedif;

import java.util.Scanner;

public class Ornek03 {
	/*
 	Kullanicidan bir yil alin ve java programi yazarak bu yilin artik yil olup olmadigini soyleyin
	eger girilen yil 100 ile bolunuyorsa, mutlaka 400 ile bolunmesi lazim, o yil artik yildir
	eger girilen yil 100 ile bolunmuyorsa, mutlaka 4 ile bolunmesi lazim, o yil artik yildir
	artik yil = leap year
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir yil giriniz");
		int yil = scan.nextInt();
		
		if (yil<0) {
			System.out.println("pozitif bir sayi girmelisin");
		}else if(yil%100==0) {
			if(yil%400==0) {
				System.out.println(yil + " artik yildir");
			}else {
				System.out.println(yil + " artik yil degildir");
			}
		}else {
			if(yil%4==0) {
				System.out.println(yil + " artik yildir");
			}else {
				System.out.println(yil + " artik yil degildir");
			}
		}
		
		
		
		
		
		
		

	}

}
