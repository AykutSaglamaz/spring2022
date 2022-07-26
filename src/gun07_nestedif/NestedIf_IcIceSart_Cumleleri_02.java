package gun07_nestedif;

import java.util.Scanner;

public class NestedIf_IcIceSart_Cumleleri_02 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi girmesini isteyin
		// eger bu sayi '0' dan kucuk ise, sonra bu sayi -9'dan kucukse "cok kucuk sayi", 
		// degilse "kucuk sayi"
		
		// eger bu sayi '0' buyuk ise, sonra bu sayi 9 buyukse "cok buyuk sayi"
		// degil ise "buyuk sayi" yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi =scan.nextInt();
		
		if(sayi<0) {
			if(sayi<-9) {
				System.out.println("cok kucuk sayi");
			}else {
				System.out.println("kucuk sayi");
			}
		}else if(sayi>0) {
			
			if(sayi>9) {
				System.out.println("cok buyuk sayi");
			}else {
				System.out.println("cok buyuk sayi");
			}
		}else {
			System.err.println("lutfen negatif veya pozitif bir sayi giriniz");
		}
		
		
		

	}

}
