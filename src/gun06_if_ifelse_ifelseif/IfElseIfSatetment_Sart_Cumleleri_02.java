package gun06_if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfSatetment_Sart_Cumleleri_02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir gun ismi al, bu gunun haftaici veya hafta sonu oldugunu yazdirin
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir gun ismi giriniz");
		String gun =scan.nextLine().toLowerCase();
		
		if(gun.equals("pazar")|| gun.equals("cumartesi")) {
			System.out.println("girdiginiz gun "+ " haftasonudur");
			
		}else if (gun.equals("pazartesi")||gun.equals("sali")
				|| gun.equals("carsamba")|| gun.equals("persembe")|| gun.equals("cuma")) {
			System.out.println("girdiginiz gun "+ " haftaicidir");
		} else {
			System.err.println("size bir gun ismi girin dedim, yanlis bir isim girdiniz");
		}

	}

}
