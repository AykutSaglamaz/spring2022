package gun07_nestedif;

import java.util.Scanner;

public class Ornek04 {
	/*
 		Kullanicidan bir sifre girmesini isteyin
		Eger sifrenin ilk harfi buyuk harf ise, bunun 'A' harfi olup olmadigini kontrol edin
		Eger ilk harf 'A' ile basliyorsa "Gecerli Sifre"
		Eger ilk harf 'A' ile baslamiyorsa "Gecersiz Sifre" ciktisi alin
		orn, Ali ==> "Gecerli Sifre" -  ali ==> "Gecersiz Sifre" - Can ==> "Gecersiz Sifre"

		eger sifrenin ilk harfi kucuk harf ise, bunun 'z' harfi olup olmadigini kontrol edin
		Eger ilk harf 'z' ile basliyorsa "Gecerli Sifre"
		Eger ilk harf 'z' ile baslamiyorsa "Gecersiz Sifre" ciktisi alin
		orn, zeynep ==> "Gecerli Sifre" -  Zeynep ==> "Gecersiz Sifre" - mehmet ==> "Gecersiz Sifre"
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sifrenizi giriniz");
		
		char ilkHarf = scan.next().charAt(0);
		
		if(ilkHarf>='A' && ilkHarf<='Z') {
			if(ilkHarf=='A') {
				System.out.println("Gecerli Sifre");
			}else {
				System.out.println("Gecersiz Sifre");
				}
			
		}else if (ilkHarf>='a' && ilkHarf<='z') {
			if(ilkHarf =='z') {
				System.out.println("Gecerli Sifre");
			}else {
				System.out.println("Gecersiz Sifre");
				}
		}else {
			System.out.println("lutfen kucuk ve buyuk harfle baslayin bir sifre girin");
		}
		
		
	}

}
